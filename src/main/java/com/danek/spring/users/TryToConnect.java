package com.danek.spring.users;
import com.danek.spring.users.validation.CheckEmail;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class TryToConnect {

    @Size(min=4, max = 25, message = "min symbols is 4/max symbols is 25")
    public String tryName;

    @Size(min = 4, max = 25, message = "min symbols is 4/max symbols is 25")
    public String tryPassword;

    @NotBlank(message = "this field not be empty")
    @Size(min = 2, max = 16001, message = "enter a current code")
    public String tryCode;


    public TryToConnect() {

    }

    public String getTryName() {
        return tryName;
    }

    public void setTryName(String tryName) {
        this.tryName = tryName;
    }

    public String getTryPassword() {
        return tryPassword;
    }

    public void setTryPassword(String tryPassword) {
        this.tryPassword = tryPassword;
    }

    public String getTryCode() {
        return tryCode;
    }

    public void setTryCode(String tryCode) {
        this.tryCode = tryCode;
    }
}
