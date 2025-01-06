package com.banking.avinash.AccountSerivice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountCreationStatus {

	
	private long accountId;
	
	
	private String message;
}
