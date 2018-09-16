package com.uni7.takersandgivers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TakersandgiversApplication {

	public static void main(String[] args) {
		SpringApplication.run(TakersandgiversApplication.class, args);
	}
}
