package com.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.project.dao.ICustomerDao;
import com.project.entity.Customer;

@Service
@Configuration
public class CustomerService implements ICustomerService{
	
	@Autowired
	ICustomerDao customerDao;
	
	public List<Customer> findAllCustomers(){
		return (List<Customer>) customerDao.findAll();
	}
	public void saveCustomer(Customer customer) {
		customerDao.save(customer);
	}
	public Customer getCustomerById(int id) {
		Optional<Customer> customer = customerDao.findById(id);
		Customer customer1 = customer.get();
		return customer1;
	}
	public void deleteCustomer(int id) {
		customerDao.deleteById(id);
		
	}
	

}
