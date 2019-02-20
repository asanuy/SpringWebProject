package com.spring.asanuy.service;

import com.spring.asanuy.dao.UserDAO;
import com.spring.asanuy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Transactional
    public void createUser(User user) {
        userDAO.createUser(user);
    }

    @Transactional
    public boolean exists(User user) {
        return userDAO.exists(user);
    }
}
