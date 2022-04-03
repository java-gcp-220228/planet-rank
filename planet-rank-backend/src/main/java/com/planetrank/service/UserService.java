package com.planetrank.service;

import com.planetrank.DAO.UserDAO;
import com.planetrank.model.User;

import javax.security.auth.login.FailedLoginException;

public class UserService {

    private final UserDAO userDAO;

    private UserService() { this.userDAO = new UserDAO(); }

    public UserService(UserDAO mockDAO) { this.userDAO = mockDAO;}

    public User login(String username, String pass) throws FailedLoginException {
        User user = this.userDAO.signInUser(username, pass);

        if (user == null) {
            throw new FailedLoginException("Invalid User and/or pass was provided.");
        }

        return user;
    }
}
