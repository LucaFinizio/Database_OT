package com.example.ot.entity;

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
@Table(name="LOCATIONS")
public class Locations {
	@Column(name="LOCATION_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer location_id;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="POSTAL_CODE")
	private String postal_code;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@ManyToOne(targetEntity=Countries.class)
	@JoinColumn(name="COUNTRY_ID")
	private String country_id;
}