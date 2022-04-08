package com.revature.planetrank.service;


import com.revature.planetrank.dao.UserRepository;
import com.revature.planetrank.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.login.FailedLoginException;


@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepo;

    public User login(String username, String password) throws FailedLoginException {

        // trim() will trim all leading and trailing whitespace
        User user = userRepo.findByUsernameAndPassword(username.trim(), password.trim());

        // No User in the database matched a particular username and password
        if (user == null) {
            throw new FailedLoginException("Invalid username and/or password");
        }

        return user;
    }
}
