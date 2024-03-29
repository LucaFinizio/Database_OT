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
@Table(name="PRODUCTS")
public class Products implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="Product_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer product_id;
	
	@Column(name="PRODUCT_NAME")
	private String product_name;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="STANDARD_COST")
	private float standard_cost;
	
	@Column(name="LIST_PRICE")
	private float list_price;	
	
	@ManyToOne(targetEntity=Product_categories.class)
	@JoinColumn(name="CATEGORY_ID")
	private Integer category_id;
}
