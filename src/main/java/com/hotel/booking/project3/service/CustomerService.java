package com.hotel.booking.project3.service;

import java.util.List;

import com.hotel.booking.project3.model.Bill;
import com.hotel.booking.project3.model.Booking;
import com.hotel.booking.project3.model.Customer;
import com.hotel.booking.project3.model.PickupAndDrop;

public interface CustomerService {

	public int customerSignup(Customer customer);
	public Customer customerLogin(String customerUserName, String password);
	public boolean isCustomerExists(int customerId);
	public boolean updateCustomer(Customer customer);
	public Customer getCustomerById(int customerId);
	
	public boolean bookingForm(Booking booking);
	public List<Booking> viewBookingHistory(int customerId);
	public boolean updateBooking(int bookingId);
	public boolean cancelBooking(int bookingId);
	public boolean addRoom(int bookingId);
	public boolean updateRoom(int bookingId);
	public boolean addExtraFood(int billNo);
	
	public boolean addPickAndDrop(int pickupAndDropId);
	public boolean updatePickAndDrop(PickupAndDrop pickupAndDrop);
	public boolean cancelPickAndDrop(int pickupAndDropId);

	public List<Bill> totalBill(int customerId);
	public int getCustomerId(String customerUserName);
}
