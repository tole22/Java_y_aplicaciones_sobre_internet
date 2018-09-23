package com.CEDICA.model;

import javax.persistence.*;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Rol_En_Clase {
	@Id @GeneratedValue
	public	int id;
	public Profesional_Interno profesional;
	
	public Rol_En_Clase(){}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Profesional_Interno getProfesional() {
		return profesional;
	}

	public void setProfesional(Profesional_Interno profesional) {
		this.profesional = profesional;
	}
}
