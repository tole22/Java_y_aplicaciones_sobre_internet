package com.CEDICA.model;

import javax.persistence.*;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Estado_Solicitud {
	@Id @GeneratedValue
	private int id;
	
	public Estado_Solicitud(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
