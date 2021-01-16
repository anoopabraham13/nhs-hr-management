package com.nhs.hr.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Application class for the NHS HR management application.
 * 
 * @author Anoop Abraham
 *
 */
@EnableJpaRepositories(basePackages = "com.nhs.hr.management.entity.repository")
@SpringBootApplication
public class Application {

	/**
	 * Main method for the HR management application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
