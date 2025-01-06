package com.banking.avinash.AccountSerivice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.avinash.AccountSerivice.Entity.Account;
import com.banking.avinash.AccountSerivice.Entity.AccountCreationStatus;
import com.banking.avinash.AccountSerivice.service.AccountServiceImpl;

import jakarta.validation.Valid;

@RestController
public class AccountController {

	@Autowired
	AccountServiceImpl accountServiceImpl;
	
	@PostMapping("/account/create-account")
	public ResponseEntity<?> createAccount(@RequestBody @Valid Account account){
		
		AccountCreationStatus accountCreationStatus = accountServiceImpl.createAccount(account);
		if(accountCreationStatus == null) {
			return new ResponseEntity<>("Customer creatertion unsuccesfull",HttpStatus.NOT_ACCEPTABLE);

		}
		return new ResponseEntity<>(accountCreationStatus,HttpStatus.CREATED);
	}
	
	@GetMapping("/account/{id}")
	public Account getAccountDetials(@PathVariable long id) {
		Account account = accountServiceImpl.getAccountDetials(id);
		if(account == null) {
			
		}
		return account;
	}
	
	@GetMapping("/account/hello")
	public String SayHi() {
	
		return "Hello";
	}
}
