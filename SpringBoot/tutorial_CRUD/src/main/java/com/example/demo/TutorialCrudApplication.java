package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//3 in 1 : configuration +auto enable+ package scan
@SpringBootApplication
public class TutorialCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialCrudApplication.class, args);
	}

}
