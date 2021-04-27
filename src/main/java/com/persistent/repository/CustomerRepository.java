package com.persistent.repository;

import org.springframework.data.repository.CrudRepository;

import com.persistent.bean.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
