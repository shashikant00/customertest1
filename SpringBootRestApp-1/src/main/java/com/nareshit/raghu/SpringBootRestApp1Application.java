package com.nareshit.raghu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestApp1Application {

	private static Logger log=LoggerFactory.getLogger(SpringBootRestApp1Application.class);
	
	public static void main(String[] args) {
		log.info("SpringBoot - main() - started");
		SpringApplication.run(SpringBootRestApp1Application.class, args);
		log.info("SpringBoot - main() - ended");

	}

}
