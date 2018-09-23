package com.CEDICA.beans;



import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import com.CEDICA.dao.impl.AlumnoDao;

import com.CEDICA.model.Alumno;



public class AlumnoBean implements Serializable{
	private static final long serialVersionUID = 1L;	
	private Alumno alumno;
	private List<Alumno> lista;
	private List<Alumno> listaFiltrada;
	
	public AlumnoBean(){
		this.alumno = new Alumno();
		AlumnoDao aluDao = new AlumnoDao();
		this.lista = aluDao.list();
	}	
	
	public Alumno getAlumno() {
		return alumno;
	}
	
	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}

	public List<Alumno> getListaFiltrada() {
		return listaFiltrada;
	}

	public void setListaFiltrada(List<Alumno> listaFiltrada) {
		this.listaFiltrada = listaFiltrada;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	public void reinit(){
		this.alumno = new Alumno();
		AlumnoDao aluDao = new AlumnoDao();
		this.lista = aluDao.list();
	}
	
		
	public void resumenAlumno(Alumno alu){
		this.alumno = alu;
		Map<String,Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("draggable", false);		
		options.put("contentHeight", 420);	
		RequestContext.getCurrentInstance().openDialog("/views/alumnos/resumen_alumno",options,null);
	}
	
	public void resumenAlumnoListener(SelectEvent event){
		this.reinit();
	}
	
	public void volverDeResumenAlumno(){
		RequestContext.getCurrentInstance().closeDialog(this.alumno);		
	}
	
	public void masInfoAlumno(Alumno alu){
		this.alumno = alu;
		Map<String,Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("draggable", false);
		options.put("height", 500);			
		RequestContext.getCurrentInstance().openDialog("editar_info",options,null);
	}
	
	public void enviarAluEditado(){
		RequestContext.getCurrentInstance().closeDialog(this.alumno);		
	}
	
	public void guardarAluEditado(SelectEvent event){
		Alumno alu = (Alumno) event.getObject();
		AlumnoDao aluDao = new AlumnoDao();
		aluDao.update(alu);
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Operación concretada...", "Alumno '"+alu.getNombre()+" "+alu.getApellido()+"' editado correctamente.");        
        FacesContext.getCurrentInstance().addMessage(null, message);
        this.reinit();
	}
}
