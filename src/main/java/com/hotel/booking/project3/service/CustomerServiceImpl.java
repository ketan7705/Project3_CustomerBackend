package com.hotel.booking.project3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.booking.project3.model.Bill;
import com.hotel.booking.project3.model.Booking;
import com.hotel.booking.project3.model.Customer;
import com.hotel.booking.project3.model.PickupAndDrop;
import com.hotel.booking.project3.repository.BillRepository;
import com.hotel.booking.project3.repository.BookingRepository;
import com.hotel.booking.project3.repository.CustomerRepository;
import com.hotel.booking.project3.repository.PickupAndDropRepository;

@Service
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
	public boolean customerSignup(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Customer Signup Called");
		customerRepository.save(customer);
		return true;
	}

	@Override
	public Customer customerLogin(String customerUserName, String password) {
		System.out.println("Patient Login called");
		return customerRepository.findByCustomerUserNameAndPassword(customerUserName, password);
	}
	
	@Override
	public boolean isCustomerExists(String customerUserName) {
		Customer customer=customerRepository.findByCustomerUserName(customerUserName);
		if(customer!=null)
			return true;
		else
			return false;
	}

	@Override
	public Customer viewProfile(String customerUserName) {
		Customer customer = customerRepository.findByCustomerUserName(customerUserName);
		return customer;
	}
	
	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		return true;
	}

	@Override
	public Customer getCustomerByUserName(String customerUserName) {	
		Customer customer = customerRepository.findByCustomerUserName(customerUserName);
		return customer;
	}

	@Override
	public boolean bookingForm(Booking booking) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public List<Booking> viewBookingHistory(int customerId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

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
	public int addPickAndDrop(PickupAndDrop pickupAndDrop) {
		pickupAndDropRepository.save(pickupAndDrop);
		int pickupAndDropId = pickupAndDrop.getPickupAndDropId();
		return pickupAndDropId;
	}

	@Override
	public boolean updatePickAndDrop(PickupAndDrop pickupAndDrop) {
		pickupAndDropRepository.save(pickupAndDrop);
		return true;
	}

	@Override
	public boolean cancelPickAndDrop(int pickupAndDropId) {
		pickupAndDropRepository.deleteById(pickupAndDropId);
		return true;
	}

	@Override
	public List<Bill> viewBill(String customerUserName) {
		// TODO Auto-generated method stub
		return (List<Bill>) billRepository.findByCustomerUserName(customerUserName);
	}
//
//	@Override
//	public int getCustomerId(String customerUserName) {
//		Customer customerData = customerRepository.findByCustomerUserName(customerUserName);
//		int customerId = customerData.getCustomerId();
//		System.out.println(customerId);
//		return customerId;
//	}

	@Override
	public boolean isPickAndDropExists(int pickupAndDropId) {
		Optional<PickupAndDrop> pickupAndDrop=pickupAndDropRepository.findById(pickupAndDropId);
		if(pickupAndDrop!=null)
			return true;
		else
			return false;
	}

}
