package com.CEDICA.model;

import java.util.List;

import javax.persistence.*;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Clase {
	@Id @GeneratedValue
	public	int id;
	@ManyToMany(mappedBy="clases")	
	public List<Alumno> alumnos;
	public Caballo caballo;
	public Coordinador coordinador;
	public Acompanante acompanante;
	public Conductor conductor;
	
	public Clase(){}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public Caballo getCaballo() {
		return caballo;
	}
	public void setCaballo(Caballo caballo) {
		this.caballo = caballo;
	}
	public Coordinador getCoordinador() {
		return coordinador;
	}
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}
	public Acompanante getAcompanante() {
		return acompanante;
	}
	public void setAcompanante(Acompanante acompanante) {
		this.acompanante = acompanante;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
}
