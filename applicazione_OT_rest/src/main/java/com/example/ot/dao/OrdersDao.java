package com.example.ot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ot.entity.Orders;

@Repository
public interface OrdersDao extends CrudRepository<Orders, Integer>{

}
