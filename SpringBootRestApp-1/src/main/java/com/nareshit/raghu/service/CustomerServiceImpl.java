package com.nareshit.raghu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nareshit.raghu.entity.Customer;
import com.nareshit.raghu.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository repository;

	public CustomerServiceImpl(CustomerRepository repository) {
		this.repository = repository;
	}

	@Override
	public Customer saveCustomerDetails(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return repository.findAll();
	}
	
	
}
