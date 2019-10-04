package com.example.ot.SupervisorControllers;

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ot.dao.CountriesDao;
import com.example.ot.dao.RegionsDao;
import com.example.ot.entity.Regions;
import com.google.gson.Gson;

/**Visualizza tutti i paesi che si trovano in un certo continente, specificando l'id del continente 
 * (i continenti sono nella tabella REGIONS)
 * 
 * @author Luca Finizio
 * 
 */
@RestController
@RequestMapping("/supervisor")
public class ShowCountriesByRegion {
	private RegionsDao regionsRepo;
	private CountriesDao countriesRepo;
	EntityManager em;
	
	@Autowired ShowCountriesByRegion (RegionsDao regionsRepo, CountriesDao countriesRepo){
		this.regionsRepo = regionsRepo;
		this.countriesRepo = countriesRepo;
	}
	
	/*@GetMapping
	public String showAllCountriesByRegionId()
	{
		
		Query q = em.createNativeQuery("SELECT c.COUNTRY_NAME, r.REGION_NAME FROM COUNTRIES as c JOIN "
				+ "REGIONS as r ON c.REGION_ID=r.REGION_ID AND c.REGION_ID = 1");
		List<Object[]> countries = q.getResultList();
		String countriesJSON = new Gson().toJson(countries);
		
		return countriesJSON;
	}*/
	
	@GetMapping("/region/{id}")
	public String showCountriesOrderedByRegion(@PathVariable("id") Integer id) {
		List<Object> countries = countriesRepo.findAllByRegionsId(id);
		String countriesJSON = new Gson().toJson(countries);
		return countriesJSON;
	}
	
	@PostMapping(path="/region", consumes="application/JSON")
	public Regions newRegion(@RequestBody Regions region)
	{
		return regionsRepo.save(region);
	}
}