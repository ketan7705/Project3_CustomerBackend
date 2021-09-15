package com.hotel.booking.project3.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hotel.booking.project3.model.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer> {
	public List<Booking> findByCustomerUserName (String customerUserName);
}
