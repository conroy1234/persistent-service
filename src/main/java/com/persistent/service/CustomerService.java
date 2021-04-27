package com.persistent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.bean.Customer;
import com.persistent.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repository;
	
	public Customer findById(int id) {
		return repository.findById(id).get();
	}
	
	public Customer save(Customer customer) {
		return repository.save(customer);
	}
	
	

}
