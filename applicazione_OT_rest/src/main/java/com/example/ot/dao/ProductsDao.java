package com.example.ot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ot.entity.Products;

@Repository
public interface ProductsDao extends CrudRepository<Products, Integer>{

}
