package com.danek.spring.users.dao;

import com.danek.spring.users.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ServiceDAOImpl implements Service{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void userSave(Users users) {
        Session session = sessionFactory.getCurrentSession();
        session.save(users);
    }

    @Override
    public List<Users> allUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<Users> allUsersList = session.createQuery("from Users", Users.class).getResultList();
        return allUsersList;
    }

    @Override
    public String searchUserByEmail(String email) {
        Session session = sessionFactory.getCurrentSession();
        Query<String> query = session.createQuery("select u.user_login from Users u where u.user_email = :email", String.class);
        query.setParameter("email", email);
        return query.uniqueResult();
    }
}
