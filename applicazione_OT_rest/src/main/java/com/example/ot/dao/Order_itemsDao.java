package com.example.ot.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ot.entity.Order_items;

@Repository
public interface Order_itemsDao extends CrudRepository<Order_items, Integer>{
	@Query("SELECT sum(quantity) from ORDER_ITEMS WHERE product_id = ?1")
	public int findQuantityByProductId(Integer product_id);
}
