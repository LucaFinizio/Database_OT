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
@Table(name="COUNTRIES")
public class Countries {
	@Column(name="COUNTRY_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String country_ID;
	
	@Column(name="COUNTRY_NAME")
	private String country_name;
	
	@ManyToOne(targetEntity=Regions.class)
	@JoinColumn(name="REGION_ID")
	private Integer region_id;
}