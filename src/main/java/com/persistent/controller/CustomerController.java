package com.persistent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.bean.Customer;
import com.persistent.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping(path="/customer-service/id/{id}")
	public Customer findById(@PathVariable int id) {
		Customer customer = customerService.findById(id);
		return new Customer(id,customer.getName(),customer.getAddress(),customer.getNumber());
	}

	@PostMapping(path="/customer-service")
	public Customer save(@RequestBody Customer customer) {
		Customer entity = customerService.save(customer);
		return new Customer(entity.getId(),customer.getName(),customer.getAddress(),customer.getNumber());
	}

}
