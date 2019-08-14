package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter51Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Chapter51Application.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

}
