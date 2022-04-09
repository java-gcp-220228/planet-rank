package com.revature.planetrank.dao;

import com.revature.planetrank.model.ExoplanetComments;
import com.revature.planetrank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    public abstract User findByUsernameAndPassword(String username, String password);

//    public abstract List<ExoplanetComments> findExoplanetCommentsByUserId(int userId);
}
