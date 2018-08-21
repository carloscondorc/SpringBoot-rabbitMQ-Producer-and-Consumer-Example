package com.eddy.springbootrabbitmqconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.eddy.springbootrabbitmqconsumer.model.Account;

@Service
public class AccountMessageListener {
	
	
    private static final Logger log = LoggerFactory.getLogger(AccountMessageListener.class);
    
    @RabbitListener(queues="${eddy.rabbitmq.queue}")
    public void receiveMessage(final Account account) {
        log.info("Received message: {}", account.toString());
        //store accounts in DB
    }

}