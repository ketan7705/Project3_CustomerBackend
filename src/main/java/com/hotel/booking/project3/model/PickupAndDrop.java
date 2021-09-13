package com.hotel.booking.project3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pickupandropdetails")
public class PickupAndDrop {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int pickupAndDropId; 
	private String location;
	private String typeOfTransport;
	private String time;
	private int numberOfPassenger;
}
