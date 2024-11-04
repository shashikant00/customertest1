package com.nareshit.raghu.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.raghu.entity.Customer;
import com.nareshit.raghu.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/save")
	public ResponseEntity<Customer> saveCustomerDetails(@RequestBody Customer customer){
		return new ResponseEntity<Customer>(service.saveCustomerDetails(customer),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public List<Customer> getAllCustomer() {
		return service.getAllCustomer();
	}
}
