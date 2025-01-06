package com.banking.avinash.AccountSerivice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.avinash.AccountSerivice.Entity.Account;
import com.banking.avinash.AccountSerivice.Entity.AccountCreationStatus;
import com.banking.avinash.AccountSerivice.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	public AccountRepository accountRepository;
	
	@Override
	public AccountCreationStatus createAccount(Account account) {
		Account saveAccount = accountRepository.save(account);
		AccountCreationStatus accountCreationStatus = new AccountCreationStatus(saveAccount.getAccountId(),"Account Created Succesfully");
		return accountCreationStatus;
	}

	@Override
	public Account getAccountDetials(long id) {
		
		return accountRepository.findById(id).get();
	}
	

}
