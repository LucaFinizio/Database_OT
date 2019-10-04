package com.example.ot.entity;

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
@Table(name="PRODUCT_CATEGORIES")
public class Product_categories {
	@Column(name="CATEGORY_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer category_id;
	
	@Column(name="CATEGORY_NAME")
	private String category_name;
}
