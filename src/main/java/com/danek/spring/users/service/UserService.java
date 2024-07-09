package com.danek.spring.users.service;

import com.danek.spring.users.entity.Users;

import java.util.List;

public interface UserService {
    public void userSave(Users users);
    public List<Users> allUsers();
    public String searchUserByEmail(String email);
}
