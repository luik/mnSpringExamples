package com.milkneko.example.model;

import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Veterinary {
	@Id
	@GeneratedValue
	private long id;
	@OneToMany(mappedBy = "veterinary", fetch = FetchType.LAZY)
	private Collection<Medic> medic;
	@OneToMany(mappedBy = "veterinary", fetch = FetchType.LAZY)
	private Collection<Customer> customer;

	@Basic
	private String name;
	@Basic
	private float value;

	public Collection<Medic> getMedic() {
		return medic;
	}

	public void setMedic(Collection<Medic> param) {
		this.medic = param;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Collection<Customer> param) {
		this.customer = param;
	}

	public String getName() {
		return name;
	}

	public void setName(String param) {
		this.name = param;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float param) {
		this.value = param;
	}
}
