package com.example.vsCodeApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VsCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VsCodeApplication.class, args);
		System.out.println("------------------------------------");
		System.out.println("Hello, VS Code with Spring Boot!");
		System.out.println("------------------------------------");
	}

}
