package com.example.ot.SupervisorControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ot.dao.EmployeesDao;
import com.google.gson.Gson;

@RestController
@RequestMapping("/supervisor")
public class ShowEmployeesOrderedByJobTitle {
	private EmployeesDao employeesDao;
	
	@Autowired 
	ShowEmployeesOrderedByJobTitle (EmployeesDao employeesDao){
		this.employeesDao = employeesDao;
	}
	
	@GetMapping("/employees")
	public String showEmployees() {
		List<Object> employees = employeesDao.showEmployeesOrderedByJobTitle();
		String employeesJSON = new Gson().toJson(employees);
		return employeesJSON;
	}
}
