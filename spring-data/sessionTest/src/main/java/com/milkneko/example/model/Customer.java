package com.milkneko.example.model;

import java.io.Serializable;
import javax.persistence.*;
import com.milkneko.example.model.Veterinary;
import com.milkneko.example.model.Pet;
import java.util.Collection;

@Entity
public class Customer implements Serializable {

	private static final long serialVersionUID = 2L;

	public Customer() {
	}

	@Id
	@GeneratedValue
	private long id;
	@ManyToOne
	private Veterinary veterinary;
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	private Collection<Pet> pet;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Veterinary getVeterinary() {
		return veterinary;
	}

	public void setVeterinary(Veterinary param) {
		this.veterinary = param;
	}

	public Collection<Pet> getPet() {
		return pet;
	}

	public void setPet(Collection<Pet> param) {
		this.pet = param;
	}

	public String getName() {
		return name;
	}

	public void setName(String param) {
		this.name = param;
	}

}