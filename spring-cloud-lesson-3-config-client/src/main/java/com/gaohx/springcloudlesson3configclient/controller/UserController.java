package com.gaohx.springcloudlesson3configclient.controller;

import com.gaohx.springcloudlesson3configclient.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired(required = false)
    private User user;

    @GetMapping("/getUser")
    public User getUser(){
        return user;
    }
}
