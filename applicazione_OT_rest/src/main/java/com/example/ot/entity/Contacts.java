package com.example.ot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@RequiredArgsConstructor
@Entity
@Table(name="CONTACTS")
public class Contacts {
	@Column(name="CONTACT_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer contact_id;
	
	@Column(name="FIRST_NAME")
	private String first_name;
	
	@Column(name="LAST_NAME")
	private String last_name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE")
	private String phone;
	
	@OneToOne(targetEntity=Customers.class)
	@JoinColumn(name="CUSTOMER_ID")
	private Integer customer_id;
}
