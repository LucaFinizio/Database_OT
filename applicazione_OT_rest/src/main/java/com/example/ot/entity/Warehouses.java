package com.example.ot.entity;

import java.io.Serializable;

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
@Table(name="WAREHOUSES")
public class Warehouses implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(name="WAREHOUSE_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer warehouse_id;
	
	@Column(name="WAREHOUSE_NAME")
	private String warehouse_name;
	
	@ManyToOne(targetEntity=Locations.class)
	@JoinColumn(name="LOCATION_ID")
	private Integer location_id;
}