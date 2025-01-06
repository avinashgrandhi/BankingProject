package com.banikingproject.Banking_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.banikingproject.Banking_security.model.UserDetails;
import com.banikingproject.Banking_security.repository.UserRepository;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private JwtService jwtService;
	
	
	
	public String saveUser(UserDetails details) {
		details.setPassword(passwordEncoder.encode(details.getPassword()));
		userRepository.save(details);
		return " User created Succesfully";
	}
	
	
	public String generateToken(String username) {
		return jwtService.generateToken(username);
	}
	
	public void validateToken(String token) {
		jwtService.validateToken(token);
	}
}
