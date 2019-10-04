package com.example.ot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name="INVENTORIES")
public class Inventories implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InventoriesId id;

	/*@ManyToOne(targetEntity=Products.class)
	@JoinColumn(name="PRODUCT_ID")
	private Integer product_id;
	
	@ManyToOne(targetEntity=Warehouses.class)
	@JoinColumn(name="WAREHOUSE_ID")
	private Integer warehouse_id;*/
	
	@Column(name="QUANTITY")
	private int quantity;
}
