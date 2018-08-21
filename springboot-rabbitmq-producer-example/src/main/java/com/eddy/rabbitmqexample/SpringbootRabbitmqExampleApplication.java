package com.eddy.rabbitmqexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootRabbitmqExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRabbitmqExampleApplication.class, args);
	}
}
