package com.eddy.springbootrabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableRabbit
public class SpringbootRabbitmqConsumerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRabbitmqConsumerExampleApplication.class, args);
	}
}
