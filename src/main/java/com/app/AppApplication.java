package com.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		   EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
	        EntityManager createEntityManager = emf.createEntityManager();
	        emf.close();
	        
		SpringApplication.run(AppApplication.class, args);
	}
	
}
