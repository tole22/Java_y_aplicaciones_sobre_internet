package com.CEDICA.model;

import javax.persistence.*;


@Entity
public class Sede {
	@Id @GeneratedValue
	public	int id;
	public    String nombre;
	public    String direccion;
	public Grilla grilla;
	
	public Sede(){}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Grilla getGrilla() {
		return grilla;
	}
	public void setGrilla(Grilla grilla) {
		this.grilla = grilla;
	}
}
