package com.revature.planetrank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PlanetRankApplication {

	public static void main(String[] args) {
		//Exoplanet exoplanet = new Exoplanet();
		//User author = new User();

		//ExoplanetComments comment = new ExoplanetComments("comment", author, null);
		//ExoplanetLikes likes = new ExoplanetLikes();
		//System.out.println(new Exoplanet("JaysPlanet", "AnkurSun", 2, 1, 2022, 100192293, 13124123, comment, likes));

		SpringApplication.run(PlanetRankApplication.class, args);

	}
}
