package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ZblSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZblSpringbootApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome(){
		return "Hello world... Welcome to Jenkins";
	}
}
