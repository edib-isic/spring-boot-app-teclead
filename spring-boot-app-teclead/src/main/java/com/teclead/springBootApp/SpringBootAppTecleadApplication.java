package com.teclead.springBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringBootAppTecleadApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringBootAppTecleadApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppTecleadApplication.class, args);
        LOGGER.info("Springboot profiles application is running successfully.");

	}

}
