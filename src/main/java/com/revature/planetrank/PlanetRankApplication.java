package com.revature.planetrank;

import com.revature.planetrank.models.ExoplanetComments;
import com.revature.planetrank.models.ExoplanetLikes;
import com.revature.planetrank.models.Exoplanets;
import com.revature.planetrank.models.UserModel;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlanetRankApplication {

	public static void main(String[] args) {
//		Exoplanets exoplanet = new Exoplanets();
		UserModel author = new UserModel();

		ExoplanetComments comment = new ExoplanetComments("comment", author, null);
		ExoplanetLikes likes = new ExoplanetLikes();
		System.out.println(new Exoplanets("JaysPlanet", "AnkurSun", 2, 1, 2022, 100192293, 13124123, comment, likes));

		//'SpringApplication.run(PlanetRankApplication.class, args);

	}

}
