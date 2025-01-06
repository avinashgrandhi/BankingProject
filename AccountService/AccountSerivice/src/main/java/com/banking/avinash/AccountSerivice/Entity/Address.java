package com.banking.avinash.AccountSerivice.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Getter
	@Setter
	@NotBlank(message="Enter your address")
	private String address1;
	
	@Getter
	@Setter
	private String address2;
	
	@Getter
	@Setter
	@NotBlank(message="Enter your city")
	private String city;
	
	@Getter
	@Setter
	@NotBlank(message="Enter your State")
	private String state;
	
	@Getter
	@Setter
	@NotBlank(message="Enter your Country")
	private String country;
	
	@Getter
	@Setter
	@NotNull(message="Entyer your zip")
	private int zip;
	
}
