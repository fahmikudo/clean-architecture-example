package com.example.cleanarch.cleanarchitectureexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.cleanarch.cleanarchitectureexample.application.usecase"})
public class CleanArchitectureExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanArchitectureExampleApplication.class, args);
	}

}
