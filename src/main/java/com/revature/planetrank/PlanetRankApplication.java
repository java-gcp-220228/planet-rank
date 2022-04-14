package com.revature.planetrank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class PlanetRankApplication {

	public static void main(String[] args) {
=======
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
>>>>>>> c602dd55cc37b1e52abca747e05ce900fc678e5c

		SpringApplication.run(PlanetRankApplication.class, args);

	}
}
