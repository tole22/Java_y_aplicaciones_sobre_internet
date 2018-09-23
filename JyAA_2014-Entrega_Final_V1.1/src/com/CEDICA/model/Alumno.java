package com.CEDICA.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="alumno")
public class Alumno {
	@Id @GeneratedValue
	private int id;
	//Estado
	private String estado;
	//Datos Personales
	private String nombre;
	private String apellido;	
	private int dni;
	private String lugarDeNac;
	private Date fechaDeNac;
	private String domicilio;
	private String telefono;
	private String sexo;
	private String edad;
	//Historia Clinica
	private Boolean poseeCertDisc;
	private String diagnostico;
	private String patologia;
	private String dificultades;
	private String habitos;
	private String alimentacion;
	private String observacionesHC;
	//Situacion Previsional
	private String obraSocial;
	private String nroAfiliadoOS;
	private Boolean poseeCuratela;	
	private String observacionesOS;
	//Situacion Socio-economica
	private String ingresos;
	private String vivienda;
	private String cantResponsables;
	private String cantPersonasACargo;
	private Boolean poseeAuto;
	//Historia Escolar
	private String escuelas;
	private String nivelEducativo;
	//Derivacion a CEDICA
	private String derivacionACEDICA;
	//Otra info
	private String otraInfo;
	//Datos de Familiares
	private String otrosFamiliares;	
	@ManyToMany(cascade={CascadeType.ALL})
	@JoinTable(name="alumno_familiar", 
		joinColumns= @JoinColumn(name="id_alumno",	referencedColumnName="id"),
		inverseJoinColumns= @JoinColumn(name="id_familiar", referencedColumnName="id"))
	private List<Familiar> familiares;
	//Relacion con la solicitud
	@OneToOne(optional = true, mappedBy="alumno")
	private Solicitud solicitud;
	
	public Alumno(){		
		this.familiares = new ArrayList<Familiar>();
    }	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getLugarDeNac() {
		return lugarDeNac;
	}

	public void setLugarDeNac(String lugarDeNac) {
		this.lugarDeNac = lugarDeNac;
	}

	public Date getFechaDeNac() {
		return fechaDeNac;
	}

	public void setFechaDeNac(Date fechaDeNac) {
		this.fechaDeNac = fechaDeNac;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public String getNroAfiliadoOS() {
		return nroAfiliadoOS;
	}

	public void setNroAfiliadoOS(String nroAfiliadoOS) {
		this.nroAfiliadoOS = nroAfiliadoOS;
	}

	public Boolean getPoseeCuratela() {
		return poseeCuratela;
	}

	public void setPoseeCuratela(Boolean poseeCuratela) {
		this.poseeCuratela = poseeCuratela;
	}

	public String getObservaciones() {
		return observacionesOS;
	}

	public void setObservaciones(String observaciones) {
		this.observacionesOS = observaciones;
	}

	public List<Familiar> getFamiliares() {
		return familiares;
	}

	public void setFamiliares(List<Familiar> familiares) {
		this.familiares = familiares;
	}

	public Boolean getPoseeCertDisc() {
		return poseeCertDisc;
	}

	public void setPoseeCertDisc(Boolean poseeCertDisc) {
		this.poseeCertDisc = poseeCertDisc;
	}

	public String getObservacionesOS() {
		return observacionesOS;
	}

	public void setObservacionesOS(String observacionesOS) {
		this.observacionesOS = observacionesOS;
	}

	public String getIngresos() {
		return ingresos;
	}

	public void setIngresos(String ingresos) {
		this.ingresos = ingresos;
	}

	public String getVivienda() {
		return vivienda;
	}

	public void setVivienda(String vivienda) {
		this.vivienda = vivienda;
	}

	public String getCantResponsables() {
		return cantResponsables;
	}

	public void setCantResponsables(String cantResponsables) {
		this.cantResponsables = cantResponsables;
	}

	public String getCantPersonasACargo() {
		return cantPersonasACargo;
	}

	public void setCantPersonasACargo(String cantPersonasACargo) {
		this.cantPersonasACargo = cantPersonasACargo;
	}

	public Boolean getPoseeAuto() {
		return poseeAuto;
	}

	public void setPoseeAuto(Boolean poseeAuto) {
		this.poseeAuto = poseeAuto;
	}

	public String getEscuelas() {
		return escuelas;
	}

	public void setEscuelas(String escuelas) {
		this.escuelas = escuelas;
	}

	public String getNivelEducativo() {
		return nivelEducativo;
	}

	public void setNivelEducativo(String nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
	}

	public String getDerivacionACEDICA() {
		return derivacionACEDICA;
	}

	public void setDerivacionACEDICA(String derivacionACEDICA) {
		this.derivacionACEDICA = derivacionACEDICA;
	}

	public String getOtraInfo() {
		return otraInfo;
	}

	public void setOtraInfo(String otraInfo) {
		this.otraInfo = otraInfo;
	}

	public String getOtrosFamiliares() {
		return otrosFamiliares;
	}

	public void setOtrosFamiliares(String otrosFamiliares) {
		this.otrosFamiliares = otrosFamiliares;
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	public String getDificultades() {
		return dificultades;
	}

	public void setDificultades(String dificultades) {
		this.dificultades = dificultades;
	}

	public String getHabitos() {
		return habitos;
	}

	public void setHabitos(String habitos) {
		this.habitos = habitos;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getObservacionesHC() {
		return observacionesHC;
	}

	public void setObservacionesHC(String observacionesHC) {
		this.observacionesHC = observacionesHC;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getPatologia() {
		return patologia;
	}

	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}
}
