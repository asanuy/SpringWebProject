package com.spring.asanuy.controller;

import com.spring.asanuy.model.User;
import com.spring.asanuy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping(value = "/signup")
public class SignUpController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity createUser(@RequestBody User user) {

        if(userService.exists(user)) {
            return new ResponseEntity(Collections.singletonMap("message", "User already exists!"), HttpStatus.CONFLICT);
        }
        userService.createUser(user);
        return new ResponseEntity(Collections.singletonMap("message", "User successfully created!"), HttpStatus.CREATED);
    }

}
