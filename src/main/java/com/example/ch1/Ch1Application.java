package com.example.ch1;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Ch1Application {
	public static void main(String[] args) {
		System.out.println("new");
		System.out.println("new2");
		System.out.println("new3");
		System.out.println("new4");
		System.out.println("return");
		System.out.println("new5");
		SpringApplication.run(Ch1Application.class, args);
	}
}
