package com.banking.avinash.AccountSerivice.service;

import com.banking.avinash.AccountSerivice.Entity.Account;
import com.banking.avinash.AccountSerivice.Entity.AccountCreationStatus;

public interface AccountService {

	public AccountCreationStatus createAccount(Account account);
	
	public Account getAccountDetials(long id);
}
