package com.jarek.zyzak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private Long id;
	
	private String number;
	
	private String street;

	public Address() {
		//super();
	}

	public Address(String number, String street) {
		super();
		this.number = number;
		this.street = street;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	
	
}
