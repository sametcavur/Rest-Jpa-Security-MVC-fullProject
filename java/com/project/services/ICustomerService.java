package com.project.services;

import java.util.List;

import com.project.entity.Customer;

public interface ICustomerService {
	public List<Customer> findAllCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public void deleteCustomer(int id);

}
