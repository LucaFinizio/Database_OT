package com.example.ot.SupervisorControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ot.dao.Order_itemsDao;
import com.google.gson.Gson;

@RestController
@RequestMapping("/supervisor")
public class OrderedQuantityByProductId {
	private Order_itemsDao order_itemsRepo;
	
	@Autowired OrderedQuantityByProductId(Order_itemsDao order_itemsRepo){
		this.order_itemsRepo = order_itemsRepo;
	}
	
	@GetMapping("/product/{id}")
	public String showOrderedQuantityByProductId(@PathVariable("id") Integer id) {
		int orderedQuantity = findQuantityByProductId(id);
		String orderedQuantityJSON = new Gson().toJson(orderedQuantity);
		return orderedQuantityJSON;
	}
}
