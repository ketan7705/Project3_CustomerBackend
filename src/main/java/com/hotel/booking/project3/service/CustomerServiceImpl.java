package com.hotel.booking.project3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hotel.booking.project3.model.Bill;
import com.hotel.booking.project3.model.Booking;
import com.hotel.booking.project3.model.Customer;
import com.hotel.booking.project3.model.PickupAndDrop;
import com.hotel.booking.project3.repository.BillRepository;
import com.hotel.booking.project3.repository.BookingRepository;
import com.hotel.booking.project3.repository.CustomerRepository;
import com.hotel.booking.project3.repository.PickupAndDropRepository;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	PickupAndDropRepository pickupAndDropRepository;
	
	@Autowired
	BillRepository billRepository;

	@Override
	public int customerSignup(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer customerLogin(String customerUserName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean bookingForm(Booking booking) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Booking> viewBookingHistory(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateBooking(int bookingId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelBooking(int bookingId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addRoom(int bookingId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateRoom(int bookingId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addExtraFood(int billNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPickAndDrop(int pickupAndDropId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePickAndDrop(PickupAndDrop pickupAndDrop) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelPickAndDrop(int pickupAndDropId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Bill> totalBill(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCustomerId(String customerUserName) {
		// TODO Auto-generated method stub
		return 0;
	}

}
