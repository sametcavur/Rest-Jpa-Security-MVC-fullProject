package com.project.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Customer;
import com.project.services.ICustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRest {
	
	//Use Postman for Post,Put,Delete operations
	

	@Autowired
	@Qualifier(value = "customerService")
	private ICustomerService customerService;
	
	@GetMapping(value = "/findAllCustomers")
	public List<Customer> findAllCustomers() {
		return customerService.findAllCustomers();
	}
	
	@GetMapping(value = "/findCustomers/{id}")
	public Customer getCustomerById(@PathVariable (value = "id") Integer id) {
		Customer customer =  customerService.getCustomerById(id);
		if(customer == null) {
			throw new CustomerNotFoundException("Not Found Customer who has this ID : " + id);
		}
		return customer;
	}
	
	@PostMapping(value = "/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return customer;
	}

	@PutMapping(value = "/putCustomer")
	public Customer putCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return customer;
	}
	
	@DeleteMapping(value = "/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable (value = "id") Integer id) {
		customerService.deleteCustomer(id);
		Customer customer =  customerService.getCustomerById(id);
		if(customer == null) {
			throw new CustomerNotFoundException("Not Found Customer who has this ID : " + id);
		}
		return "Customer deleted,ID : " + id;
	}
}
