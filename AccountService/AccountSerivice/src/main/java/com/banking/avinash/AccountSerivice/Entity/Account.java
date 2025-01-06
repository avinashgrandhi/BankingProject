package com.banking.avinash.AccountSerivice.Entity;


import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="ACCOUNT")
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	
	@Id
	@NotNull(message="Enter Account Number")
	@SequenceGenerator(name="seq",initialValue = 10000001)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
	private long accountId;
	
	
	@NotBlank(message="Enter FistName")
	private String firstName;
	
	
	@NotBlank(message="Enter LastName")
	private String lastName;
	
	@NotNull(message="Enter Opening Date")
	private Date dob;
	
	
	@NotBlank(message="Enter gmail")
	private String gmail;
	

	@NotNull(message="Enter contact Number")
	private long phoneNo;
	
	 @OneToOne(
	            orphanRemoval = true,
	            cascade = { CascadeType.PERSIST, CascadeType.REMOVE }
	    )
	private Address address;
	
	@NotBlank(message="Select CustomerId type")

	private String customerIdType;
	
	@NotBlank(message="Enter CustomerId")
	private String customerId;
	
	@Min(value = 50,message = "Intial deposit should be minimum 50$")
	private double currentBalance;
	
	@NotBlank(message="Enter AccountType")

	private String accountType;
	

	@NotNull(message="Enter SSN NUmber")
	private long ssn;
	
	
	
	
}
