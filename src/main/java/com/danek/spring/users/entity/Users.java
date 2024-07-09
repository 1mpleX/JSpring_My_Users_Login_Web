package com.danek.spring.users.entity;

import com.danek.spring.users.validation.CheckEmail;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "my_users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_login")
    private
    @Size(min = 4, max = 25, message = "min symbols is 4/max symbols is 25")
    String user_login;

    @Column(name = "user_password")
    private
    @Size(min = 4, max = 25, message = "min symbols is 4/max symbols is 25")
    String user_password;

    @Column(name = "user_email")
    private
    @CheckEmail
    String user_email;

    @Column(name = "user_code")
    private String user_code;

    public Users(){

    }

    public Users(String user_login, String user_password, String user_email, String user_code) {
        this.user_login = user_login;
        this.user_password = user_password;
        this.user_email = user_email;
        this.user_code = user_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    @Override
    public String toString() {
        return user_login + " " + user_password;
    }

    public String toStringForName(){
        return user_email + " " + user_password;
    }
}
