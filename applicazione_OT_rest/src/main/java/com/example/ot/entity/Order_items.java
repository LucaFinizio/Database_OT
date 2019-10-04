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
@Table(name="ORDER_ITEMS")
public class Order_items {
	@Column(name="ITEM_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer item_id;
	
	@ManyToOne(targetEntity=Locations.class)
	@JoinColumn(name="ORDER_ID")
	private Integer order_id;
	
	@ManyToOne(targetEntity=Locations.class)
	@JoinColumn(name="PRODUCT_ID")
	private Integer product_id;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="UNIT_PRICE")
	private float unit_price;
}