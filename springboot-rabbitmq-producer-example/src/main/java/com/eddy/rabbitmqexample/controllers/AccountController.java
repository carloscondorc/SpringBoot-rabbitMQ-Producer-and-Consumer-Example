package com.eddy.rabbitmqexample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eddy.rabbitmqexample.model.Account;
import com.eddy.rabbitmqexample.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/send-message")
	public ResponseEntity<Account> sendMessage() {
		Account account = new Account();
		account.setAccountNumber(Math.random()+"");
		account.setBalance(2000+Math.random());
		
		accountService.produceAndSendMessage(account);
		return new ResponseEntity<>(account,HttpStatus.OK);
	}
}
