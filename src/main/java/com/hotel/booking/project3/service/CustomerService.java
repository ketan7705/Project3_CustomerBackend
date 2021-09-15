package com.hotel.booking.project3.service;

import java.util.List;

import com.hotel.booking.project3.model.Bill;
import com.hotel.booking.project3.model.Booking;
import com.hotel.booking.project3.model.Customer;
import com.hotel.booking.project3.model.PickupAndDrop;

public interface CustomerService {

	public boolean customerSignup(Customer customer);
	public Customer customerLogin(String customerUserName, String password);
	public boolean isCustomerExists(String customerUserName);
	public Customer viewProfile(String customerUserName);
	public boolean updateCustomer(Customer customer);
	public Customer getCustomerByUserName(String customerUserName);
	
	public boolean bookingForm(Booking booking);
//	public List<Booking> viewBookingHistory(String customerUserName);
	public boolean updateBooking(int bookingId);
	public boolean cancelBooking(int bookingId);
	public boolean addRoom(int bookingId);
	public boolean updateRoom(int bookingId);
	public boolean addExtraFood(int billNo);
	
	public int addPickAndDrop(PickupAndDrop pickupAndDrop);
	public boolean updatePickAndDrop(PickupAndDrop pickupAndDrop);
	public boolean cancelPickAndDrop(int pickupAndDropId);
	public boolean isPickAndDropExists(int pickupAndDropId);
	
	public List<Bill> viewBill(String customerUserName);
//	
//	public int getCustomerId(String customerUserName);
}
