package com.example.ot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REGIONS")
public class Regions {
	@Column(name="REGION_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer region_id;
	
	@Column(name="REGION_NAME")
	private String region_name;

	public Integer getRegion_id() {
		return region_id;
	}

	private void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}

	public String getRegion_name() {
		return region_name;
	}

	private void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	public Regions(Integer region_id, String region_name) {
		super();
		this.region_id = region_id;
		this.region_name = region_name;
	}

	public Regions() {
		super();
	}
}
