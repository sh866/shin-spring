package com.example.ch1;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Ch1Application {
	public static void main(String[] args) {
		System.out.println("new");
		SpringApplication.run(Ch1Application.class, args);
	}
}
