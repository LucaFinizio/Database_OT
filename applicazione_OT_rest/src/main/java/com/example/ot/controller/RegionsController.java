package com.example.ot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ot.dao.RegionsDao;
import com.example.ot.entity.Regions;
import com.google.gson.Gson;

@RestController
@RequestMapping("/regions")
public class RegionsController {
	
	private RegionsDao regionsRepo;
	
	@Autowired
	public RegionsController(RegionsDao regionsRepo) 
	{
		this.regionsRepo = regionsRepo;
	}
	
	
	@GetMapping
	public String showAllRegions() 
	{
		
		//Creo una lista che conterrà tutte le regioni
		List<Regions> regions = new ArrayList<>();
		
		//Riempio la lista "regions"
		regionsRepo.findAll().forEach(i -> regions.add(i));
	
		//Converto l'oggetto lista in un file JSON (che sarebbe una stringa)
	    String regionsJSON = new Gson().toJson(regions);
			
		return regionsJSON;
	}
	
	
	//Only show a region by its id
	@GetMapping("/{id}")
	public String regionById(@PathVariable("id") Integer id) 
	{
		Optional<Regions> optRegion = regionsRepo.findById(id);
		if(optRegion.isPresent())
		{
			String region = new Gson().toJson(optRegion);
			return region;
		}
		return null;
	}
}