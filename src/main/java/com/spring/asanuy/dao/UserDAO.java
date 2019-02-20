package com.spring.asanuy.dao;

import com.spring.asanuy.model.User;

public interface UserDAO {

    public void createUser(User user);

    public boolean exists(User user);
}
