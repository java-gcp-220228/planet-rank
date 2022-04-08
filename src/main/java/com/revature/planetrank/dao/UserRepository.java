package com.revature.planetrank.dao;

import com.revature.planetrank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public abstract User findByUsernameAndPassword(String username, String password);
}
