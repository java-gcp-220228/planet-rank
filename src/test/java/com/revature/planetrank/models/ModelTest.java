package com.revature.planetrank.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
public class ModelTest {

    @Test
    public void modelCreation_positive() {
        UserModel author = new UserModel();
        ExoplanetComments comment = new ExoplanetComments("comment", author, null);
        ExoplanetLikes likes = new ExoplanetLikes();
        System.out.println(new Exoplanets("JaysPlanet", "AnkurSun", 2, 1, 2022, 100192293, 13124123, comment, likes));
    }

    @Test
    public void modelCreation_negative() {
        UserModel author = new UserModel();
        ExoplanetComments comment = new ExoplanetComments("comment", author, null);
        ExoplanetLikes likes = new ExoplanetLikes();
        Exoplanets actual_exo = new Exoplanets("JacksPlanet", "AnkurSun", 2, 1, 2022, 100192293, 13124123, comment, likes);
        Exoplanets expected_exo = new Exoplanets("JaysPlanet", "AnkurSun", 2, 1, 2022, 100192293, 13124123, comment, likes);
        Assertions.assertNotEquals(expected_exo, actual_exo);

    }

}
