package com.springboot.jenkins.testing.app;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsTestingAppApplication {

	public static Logger logger=LoggerFactory.getLogger(SpringBootJenkinsTestingAppApplication.class);
	
	@PostConstruct
	public void init() {
		
		logger.info("Application started.....");
	}
	
	public static void main(String[] args) {
		logger.info("Application execution........");
		SpringApplication.run(SpringBootJenkinsTestingAppApplication.class, args);
	}

}
