package com.revature.planetrank.service;

import com.revature.planetrank.dao.UserRepository;
import com.revature.planetrank.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        User newUser = userRepository.save(user);
        return newUser;
    };
}
