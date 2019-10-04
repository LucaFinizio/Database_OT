package com.example.ot.dao;

import com.example.ot.entity.Regions;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionsDao extends CrudRepository<Regions, Integer>{
	
	
}
