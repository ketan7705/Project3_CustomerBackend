package com.hotel.booking.project3.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hotel.booking.project3.model.Bill;


public interface BillRepository extends CrudRepository<Bill, Integer> {
	public List<Bill> findByCustomerUserName(String customerUserName);
}
