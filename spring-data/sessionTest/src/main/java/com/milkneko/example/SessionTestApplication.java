package com.milkneko.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.milkneko.example.managers.InitializerManager;

@SpringBootApplication
public class SessionTestApplication implements CommandLineRunner {
	
	@Autowired
	private InitializerManager initializerManager;

	public static void main(String[] args) {
		SpringApplication.run(SessionTestApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		initializerManager.initialize(); 
		
	}
}
