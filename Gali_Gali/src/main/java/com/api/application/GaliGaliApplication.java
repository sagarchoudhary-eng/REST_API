package com.api.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.api.*")
@ComponentScan(basePackages = "com.api.*")
@EntityScan("com.api.*")  
@EnableJpaRepositories(basePackages={"com.api.repository"})
public class GaliGaliApplication {

	public static void main(String[] args) {
		SpringApplication.run(GaliGaliApplication.class, args);
	}

}
