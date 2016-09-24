package com.milkneko.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SessionTestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SessionTestApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("hello ...");
		
	}
}
