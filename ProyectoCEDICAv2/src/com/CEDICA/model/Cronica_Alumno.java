package com.CEDICA.model;

import java.util.Date;
import javax.persistence.*;


@Entity
public class Cronica_Alumno {
	@Id @GeneratedValue
	public	int id;
	public    String texto_libre;
	public    Date fecha;
	public Acompanante acompanante;
	public Alumno alumno;
	public Caballo caballo;
	
	public Cronica_Alumno(){}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTexto_libre() {
		return texto_libre;
	}
	public void setTexto_libre(String texto_libre) {
		this.texto_libre = texto_libre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Acompanante getAcompanante() {
		return acompanante;
	}
	public void setAcompanante(Acompanante acompanante) {
		this.acompanante = acompanante;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Caballo getCaballo() {
		return caballo;
	}
	public void setCaballo(Caballo caballo) {
		this.caballo = caballo;
	}
}
