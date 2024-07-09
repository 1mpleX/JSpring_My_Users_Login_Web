package com.danek.spring.users.service;


import com.danek.spring.users.dao.ServiceDAOImpl;
import com.danek.spring.users.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ServiceDAOImpl registrDAOimpl;

    @Override
    @Transactional
    public void userSave(Users users) {
        registrDAOimpl.userSave(users);
    }

    @Override
    @Transactional
    public List<Users> allUsers() {
        return registrDAOimpl.allUsers();
    }

    @Override
    @Transactional
    public String searchUserByEmail(String email) {
        return registrDAOimpl.searchUserByEmail(email);
    }
}
