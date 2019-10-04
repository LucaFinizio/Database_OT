package com.example.ot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ot.entity.Inventories;
import com.example.ot.entity.InventoriesId;

@Repository
public interface InventoriesDao extends CrudRepository<Inventories, InventoriesId>{

}
