package com.nareshit.raghu.service;

import java.util.List;

import com.nareshit.raghu.entity.Customer;

public interface CustomerService {

	Customer saveCustomerDetails(Customer customer);

	List<Customer> getAllCustomer();

}
