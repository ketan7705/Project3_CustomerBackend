package com.hotel.booking.project3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "bookingdetails")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bookingId; 
	private int customerId;
	private int idProof;
	private int roomType;
	private int numberOfRoom;
	private int roomSize;
	private int roomNumber;
    private String breakfast;
    private String drinks;
    private String checkInDate;
    private String checkOutDate;
	private String pickupAndDrop;
	private boolean Cancellation=false;
    
}
