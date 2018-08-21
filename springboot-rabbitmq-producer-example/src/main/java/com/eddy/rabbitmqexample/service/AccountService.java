package com.eddy.rabbitmqexample.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.eddy.rabbitmqexample.model.Account;

@Service
public class AccountService {

	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${eddy.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${eddy.rabbitmq.routingkey}")
	private String routingKey;
	
	
	public void produceAndSendMessage(Account account){
		amqpTemplate.convertAndSend(exchange, routingKey, account);
		System.out.println("Send msg = " + account);
	}
	@Scheduled(fixedDelay = 3000L)
	public void sendScheduleMessage(){
		Account account = new Account();
		account.setAccountNumber(Math.random()+"");
		account.setBalance(2000+Math.random());
		
		amqpTemplate.convertAndSend(exchange, routingKey, account);
		System.out.println("Send Message = " + account);
	}
}
