package com.CEDICA.model;

import javax.persistence.*;


@Entity
public class Grilla {
	@Id @GeneratedValue
	public	int id;
	public Reserva reservas;
	public Clase clases;
	public Turno turno;
	
	public Grilla(){}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Reserva getReservas() {
		return reservas;
	}
	public void setReservas(Reserva reservas) {
		this.reservas = reservas;
	}
	public Clase getClases() {
		return clases;
	}
	public void setClases(Clase clases) {
		this.clases = clases;
	}
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
}
