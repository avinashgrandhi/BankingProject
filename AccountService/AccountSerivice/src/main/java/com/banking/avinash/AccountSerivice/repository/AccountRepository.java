package com.banking.avinash.AccountSerivice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.avinash.AccountSerivice.Entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	
	
}
