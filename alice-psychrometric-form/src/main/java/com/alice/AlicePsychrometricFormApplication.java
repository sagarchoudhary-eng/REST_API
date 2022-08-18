package com.alice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.alice")
public class AlicePsychrometricFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlicePsychrometricFormApplication.class, args);
	}

}
