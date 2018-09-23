package com.CEDICA.model;

import java.util.List;

import javax.persistence.*;


@Entity
public class Alumno extends Persona {	
	public    String obra_social;	
	public    String diagnostico;
	public Familiar familiar;
	public Legajo nro_legajo;
	@ManyToMany
	@JoinTable(name="Clases_Alumnos", 
		joinColumns= @JoinColumn(name="id_alumno",	referencedColumnName="id"),
		inverseJoinColumns= @JoinColumn(name="id_clase", referencedColumnName="id")
	)
	private List<Clase> clases;
	
	public List<Clase> getClases() {
		return clases;
	}
	public void setClases(List<Clase> clases) {
		this.clases = clases;
	}
	public String getObra_social() {
		return obra_social;
	}
	public void setObra_social(String obra_social) {
		this.obra_social = obra_social;
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public Familiar getFamiliar() {
		return familiar;
	}
	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}
	public Legajo getNro_legajo() {
		return nro_legajo;
	}
	public void setNro_legajo(Legajo nro_legajo) {
		this.nro_legajo = nro_legajo;
	}
}
