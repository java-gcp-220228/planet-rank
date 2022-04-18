package com.revature.planetrank.service;

import com.revature.planetrank.dao.UserRepository;
import com.revature.planetrank.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public final UserRepository userRepository;

    public User createUser(User user) throws IllegalArgumentException{

        if(user.getUsername().length()<=8 || user.getPassword().length()<=8){
            throw new IllegalArgumentException("username and password must be 8 characters long");
        }
        // Encrypt password
        user.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt()));
        User newUser = userRepository.save(user);
        return newUser;
    };
    public List<User> getAllUsers(){return userRepository.findAll();}
    public User getUserById(int id){
        return userRepository.getById(id);
    }
}
