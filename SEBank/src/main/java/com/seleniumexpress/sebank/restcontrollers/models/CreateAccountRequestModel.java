package com.seleniumexpress.sebank.restcontrollers.models;

import java.util.UUID;

public class CreateAccountRequestModel {
	
	private UUID accountNumber;
	private String accountHolderName;
	private int createdYear;
	
	public UUID getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(UUID accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getCreatedYear() {
		return createdYear;
	}
	public void setCreatedYear(int createdYear) {
		this.createdYear = createdYear;
	}

}
