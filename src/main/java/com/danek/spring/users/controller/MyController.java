package com.danek.spring.users.controller;

import com.danek.spring.users.EmailSender;
import com.danek.spring.users.TryToConnect;
import com.danek.spring.users.entity.Users;
import com.danek.spring.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    private String login;
    private String password;
    private String email;


    @RequestMapping("/")
    public String firstView(){
        return "first-view";
    }

    @RequestMapping("/registrationView")
    public String registration(Model model){

        Users user = new Users();
        model.addAttribute("user", user);


        return "registration-view";
    }

    @RequestMapping("/enterCode")
    public String enterCode(Model model,
                            @Valid @ModelAttribute("user") Users user,
                            BindingResult bindingResult){
        EmailSender.userEmail = user.getUser_email();
        TryToConnect tryToConnect = new TryToConnect();

        model.addAttribute("tryToConnect", tryToConnect);

        login = user.getUser_login();
        password = user.getUser_password();
        email = user.getUser_email();

        if (!bindingResult.hasErrors()) {
            model.addAttribute("user", new Users());
            EmailSender.sendCode();
            return "enter-code";
        }

        return "registration-view";
    }

    @RequestMapping("/authorizationView")
    public String authorizationView(@Valid @ModelAttribute("tryToConnect") TryToConnect tryToConnect,
                                    BindingResult bindingResult){

        return "authorization-view";
    }

    @RequestMapping("/welcome")
    public String welcome(@Valid @ModelAttribute("tryToConnect") TryToConnect tryToConnect,
                          BindingResult bindingResult,
                          Model model,
                          @ModelAttribute("user")Users user){
        
        AtomicBoolean userFlag = new AtomicBoolean(false);
        List<Users> list = userService.allUsers();

        StringBuilder stringBuilderLogin = new StringBuilder();
        stringBuilderLogin.append(tryToConnect.tryName).append(" ").append(tryToConnect.tryPassword);
        String resultLogin = stringBuilderLogin.toString();

        list.forEach(event -> {
            if (event.toString().equals(resultLogin) || event.toStringForName().equals(resultLogin)){
                for (int a=0; a < tryToConnect.tryName.length(); a++){
                    if (tryToConnect.tryName.charAt(a)=='@'){
                        tryToConnect.setTryName(userService.searchUserByEmail(tryToConnect.tryName));
                    }
                    if (login!=null){
                        tryToConnect.setTryName(login);
                    }
                    else{
                        tryToConnect.setTryName(tryToConnect.tryName);
                    }
                }
                userFlag.set(true);
            }
        });

        if (login!=null){
            tryToConnect.setTryName(login);
        }

        try {
            if (!userFlag.get()){
                if (tryToConnect.tryCode==null){
                    return "authorization-view";
                }
                if (EmailSender.userCode==Integer.parseInt(tryToConnect.tryCode)){

                    user.setUser_login(login);
                    user.setUser_password(password);
                    user.setUser_email(email);
                    user.setUser_code(String.valueOf(EmailSender.userCode));

                    model.addAttribute("user", user);

                    userService.userSave(user);
                    return "welcome";
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }



        if (tryToConnect.tryCode!=null){
            if (!userFlag.get()){
                return "enter-code";
            }
        }

        return "welcome";
    }
}
