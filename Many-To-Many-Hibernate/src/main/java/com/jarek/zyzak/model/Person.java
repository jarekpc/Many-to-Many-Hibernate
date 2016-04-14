package com.jarek.zyzak.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToMany(cascade = {CascadeType.ALL})		
	//private List<Address> addresses = new ArrayList<>();
	private List<Address> addresses = new ArrayList<Address>();
	
	public Person() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
		
}
