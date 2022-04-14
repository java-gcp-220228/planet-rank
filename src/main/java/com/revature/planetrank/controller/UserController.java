package com.revature.planetrank.controller;

import com.revature.planetrank.model.User;
import com.revature.planetrank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User createNewUser(@RequestBody User user){
        User newUser = userService.createUser(user);
        return newUser;
    }
}
