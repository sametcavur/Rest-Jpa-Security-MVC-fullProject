package com.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Customer;

@Repository
public interface ICustomerDao extends CrudRepository<Customer, Integer>{
}
