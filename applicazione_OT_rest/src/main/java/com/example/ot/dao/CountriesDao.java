package com.example.ot.dao;

import org.springframework.stereotype.Repository;

import com.example.ot.entity.Countries;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface CountriesDao extends CrudRepository<Countries, String>{
	@Query("SELECT c.country_name, r.region_name FROM Countries as c JOIN" + 
			" Regions as r ON c.region_id=r.region_id AND r.region_id = ?1")
	public List<Object> findAllByRegionsId(Integer region_id);
}
