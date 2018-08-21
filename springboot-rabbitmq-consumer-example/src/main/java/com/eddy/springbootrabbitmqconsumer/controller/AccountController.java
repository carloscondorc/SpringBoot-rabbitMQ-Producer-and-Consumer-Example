package com.eddy.springbootrabbitmqconsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eddy.springbootrabbitmqconsumer.model.Account;
import com.eddy.springbootrabbitmqconsumer.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;
	
	
	@GetMapping("/read-messages")
	public ResponseEntity<List<Account>> readMessages() {
		return new ResponseEntity<>(accountService.getAccounts(),HttpStatus.OK);
	}
}
