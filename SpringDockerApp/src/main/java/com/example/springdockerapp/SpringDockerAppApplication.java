package com.example.springdockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerAppApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Spring Boot Docker Demo";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerAppApplication.class, args);
	}

}

