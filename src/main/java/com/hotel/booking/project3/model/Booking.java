package com.hotel.booking.project3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "bookingformdetails")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bookingId; 
	private String customerUserName;
	private String email;
	private String idProof;
	private String roomType;
	private int numberOfRoom;
	private String roomSize;
	private int roomNumber;
    private String breakfast;
    private String drinks;
    private String checkInDate;
    private String checkOutDate;
	private String pickupAndDrop;
	private String cancellation="False";
	private String bookingStatus="Pending";
//	private Room roomPrice; 
//take the price from based on room type and room size
  
}
