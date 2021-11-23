package com.example.realworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RealworldJhApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealworldJhApplication.class, args);
	}

}
