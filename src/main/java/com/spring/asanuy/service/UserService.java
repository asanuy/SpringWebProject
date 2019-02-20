package com.spring.asanuy.service;

import com.spring.asanuy.model.User;

public interface UserService {

    public void createUser(User user);

    public boolean exists(User user);
}
