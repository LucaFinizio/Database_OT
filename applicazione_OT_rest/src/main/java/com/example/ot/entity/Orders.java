package com.example.ot.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@RequiredArgsConstructor
@Entity
@Table(name="ORDERS")
public class Orders {
	@Column(name="ORDER_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer order_id;
	
	@ManyToOne(targetEntity=Locations.class)
	@JoinColumn(name="LOCATION_ID")
	private Integer customer_id;
	
	@Column(name="STATUS")
	private String status;
	
	@ManyToOne(targetEntity=Locations.class)
	@JoinColumn(name="EMPLOYEE_ID")
	private Integer salesman_id;
	
	@Column(name="ORDER_DATE")
	private Date order_date;
}