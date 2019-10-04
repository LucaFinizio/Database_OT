package com.example.ot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ot.entity.Warehouses;

@Repository
public interface WarehousesDao extends CrudRepository<Warehouses, Integer>{

}
