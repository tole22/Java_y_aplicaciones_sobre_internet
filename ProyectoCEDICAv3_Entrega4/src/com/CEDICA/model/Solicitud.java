package com.CEDICA.model;

import javax.persistence.*;

@Entity
public class Solicitud {
	@Id @GeneratedValue
	public	int id;
	public    Integer nro_tramite;
	public Estado_Solicitud estado;
	public Aspirante aspirante;
	public Institucion institucion;
	
	public Solicitud(){}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Integer getNro_tramite() {
		return nro_tramite;
	}
	public void setNro_tramite(Integer nro_tramite) {
		this.nro_tramite = nro_tramite;
	}
	public Estado_Solicitud getEstado() {
		return estado;
	}
	public void setEstado(Estado_Solicitud estado) {
		this.estado = estado;
	}
	public Aspirante getAspirante() {
		return aspirante;
	}
	public void setAspirante(Aspirante aspirante) {
		this.aspirante = aspirante;
	}
	public Institucion getInstitucion() {
		return institucion;
	}
	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}
}
