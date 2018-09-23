package com.CEDICA.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Profesional_Interno extends Persona {
	public    String titulo;
	public Rol_En_Clase rol;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Rol_En_Clase getRol() {
		return rol;
	}
	public void setRol(Rol_En_Clase rol) {
		this.rol = rol;
	}
}
