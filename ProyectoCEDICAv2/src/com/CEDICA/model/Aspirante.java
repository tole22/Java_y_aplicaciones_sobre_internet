package com.CEDICA.model;

import javax.persistence.*;

@Entity
public class Aspirante extends Persona {
	public Reserva reserva;

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
}
