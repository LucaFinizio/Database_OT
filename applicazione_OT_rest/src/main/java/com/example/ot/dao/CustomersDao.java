package com.example.ot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ot.entity.Customers;

@Repository
public interface CustomersDao extends CrudRepository<Customers, Integer>{
	
}
