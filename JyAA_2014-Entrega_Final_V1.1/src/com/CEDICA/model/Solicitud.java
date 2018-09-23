package com.CEDICA.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="solicitud")
public class Solicitud {
	@Id @GeneratedValue
	private int id;
	private String estado;
	private Integer nroDeTramite;
	private Date fecha;	
	@OneToOne(optional= false, cascade={CascadeType.ALL})
	private Alumno alumno;
	@ManyToOne(optional = true)
	@JoinTable(name="solicitud_institucion",
				joinColumns=@JoinColumn(name="id_solicitud", referencedColumnName="id"),
				inverseJoinColumns=@JoinColumn(name="id_institucion", referencedColumnName="id"))
	private Institucion institucion;
	
	
	public Solicitud() {
		this.alumno = new Alumno();
		this.institucion = new Institucion();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Integer getNroDeTramite() {
		return nroDeTramite;
	}


	public void setNroDeTramite(Integer nroDeTramite) {
		this.nroDeTramite = nroDeTramite;
	}


	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}


	public Institucion getInstitucion() {
		return institucion;
	}


	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
