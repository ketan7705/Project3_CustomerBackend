package com.hotel.booking.project3.repository;

import org.springframework.data.repository.CrudRepository;

import com.hotel.booking.project3.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
