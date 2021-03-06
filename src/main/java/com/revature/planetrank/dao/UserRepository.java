package com.revature.planetrank.dao;

import com.revature.planetrank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public abstract User findByUserId(int userId);

    public abstract User findByUsername(String username);

}
