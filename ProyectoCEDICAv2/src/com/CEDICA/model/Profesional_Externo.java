package com.CEDICA.model;

import javax.persistence.Entity;

@Entity
public class Profesional_Externo extends Persona {
	public    String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
