package com.milkneko.example.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Medic implements Serializable {

	private static final long serialVersionUID = 1L;

	public Medic() {
	}

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	private Veterinary veterinary;

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

	public String getName() {
		return name;
	}

	public void setName(String param) {
		this.name = param;
	}

}