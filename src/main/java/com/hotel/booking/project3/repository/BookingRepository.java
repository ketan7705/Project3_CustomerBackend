package com.hotel.booking.project3.repository;

import org.springframework.data.repository.CrudRepository;

import com.hotel.booking.project3.model.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

}
