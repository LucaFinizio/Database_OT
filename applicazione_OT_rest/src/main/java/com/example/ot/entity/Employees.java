package com.example.ot.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@RequiredArgsConstructor
@Entity
@Table(name="EMPLOYEES")
public class Employees {
	@Column(name="EMPLOYEE_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employee_id;
	
	@Column(name="FIRST_NAME")
	private String first_name;
	
	@Column(name="LAST_NAME")
	private String last_name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE")
	private String phone;
	
	@Column(name="HIRE_DATE")
	private Date hire_date;
	
	@Column(name="MANAGER_ID")
	private int manager_id;
	
	@Column(name="JOB_TITLE")
	private String job_title;
}