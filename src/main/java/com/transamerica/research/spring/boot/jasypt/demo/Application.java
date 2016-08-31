package com.transamerica.research.spring.boot.jasypt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String... args) throws Exception {
    	System.setProperty("jasypt.encryptor.password", "aeonflux"); 
		SpringApplication.run(Application.class, args);
    }
	
}