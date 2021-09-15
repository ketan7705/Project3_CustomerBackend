package com.hotel.booking.project3.model;



import lombok.Data;

@Data
public class ForgetPassword {
	private String customerUserName;
	private String mobileNumber; 
	private String password;
}
