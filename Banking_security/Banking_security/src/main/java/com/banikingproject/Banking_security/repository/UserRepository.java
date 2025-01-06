package com.banikingproject.Banking_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banikingproject.Banking_security.model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer>{

}
