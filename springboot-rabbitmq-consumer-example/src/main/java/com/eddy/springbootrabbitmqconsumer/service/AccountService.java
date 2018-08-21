package com.eddy.springbootrabbitmqconsumer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eddy.springbootrabbitmqconsumer.model.Account;

@Service
public class AccountService {

	public List<Account> getAccounts() {
		
		//read Account from DB
		return null;
	}
}
