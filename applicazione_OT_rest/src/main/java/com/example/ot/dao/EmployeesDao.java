package com.example.ot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ot.entity.Employees;

@Repository
public interface EmployeesDao extends CrudRepository<Employees, Integer>{
	@Query("SELECT e.employee_id, e.first_name, e.last_name, e.job_title FROM Employees as e" + 
			" ORDER BY job_title")
	public List<Object> showEmployeesOrderedByJobTitle();
}