package com.revature.planetrank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class PlanetRankApplication {

	public static void main(String[] args) {

		SpringApplication.run(PlanetRankApplication.class, args);

	}
}
