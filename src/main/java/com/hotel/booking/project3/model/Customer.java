package com.hotel.booking.project3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customerdetails")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerId;
	private String customerName;
	private String customerUserName;
	private String password;
	private String mobileNumber;
	private String email;
	private String gender;
	private int age;
	private String city;
	private String state;
	private String location;
}
