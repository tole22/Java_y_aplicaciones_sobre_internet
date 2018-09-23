package com.CEDICA.model;

import java.sql.Time;
import javax.persistence.*;


@Entity
public class Reserva {
	@Id @GeneratedValue
	public	int id;
	public    Time hora_inicio;
	public    Time hora_fin;
	public Aspirante aspirante;
	
	public Reserva(){}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Time getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(Time hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	public Time getHora_fin() {
		return hora_fin;
	}
	public void setHora_fin(Time hora_fin) {
		this.hora_fin = hora_fin;
	}
	public Aspirante getAspirante() {
		return aspirante;
	}
	public void setAspirante(Aspirante aspirante) {
		this.aspirante = aspirante;
	}
}
