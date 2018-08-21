package com.eddy.springbootrabbitmqconsumer.model;

import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String accountNumber;
	private Double balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
	
}
