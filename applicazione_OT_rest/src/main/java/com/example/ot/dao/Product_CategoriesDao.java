package com.example.ot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ot.entity.Product_categories;

@Repository
public interface Product_CategoriesDao extends CrudRepository<Product_categories, Integer>{

}
