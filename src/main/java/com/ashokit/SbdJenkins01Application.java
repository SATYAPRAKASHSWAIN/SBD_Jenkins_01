package com.ashokit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SbdJenkins01Application {
	
	public static Logger logger=LoggerFactory.getLogger(SbdJenkins01Application.class);

	@PostConstruct
	public  intt() {
		logger.info("Application started ...................");
	}
	
	public static void main(String[] args) {
		logger.info("Application executed ...................");
		SpringApplication.run(SbdJenkins01Application.class, args);
	}

}
