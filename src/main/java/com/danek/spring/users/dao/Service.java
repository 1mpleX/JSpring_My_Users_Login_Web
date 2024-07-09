package com.danek.spring.users.dao;

import com.danek.spring.users.entity.Users;

import java.util.List;


public interface Service {
    public void userSave(Users users);
    public List<Users> allUsers();
    public String searchUserByEmail(String email);
}
