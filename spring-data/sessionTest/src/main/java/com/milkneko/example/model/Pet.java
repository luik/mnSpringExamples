package com.milkneko.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.milkneko.example.model.Customer;
import javax.persistence.ManyToOne;

@Entity
public class Pet {
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne
	private Customer customer;
	private String name;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer param) {
		this.customer = param;
	}

	public String getName() {
		return name;
	}

	public void setName(String param) {
		this.name = param;
	}
}
