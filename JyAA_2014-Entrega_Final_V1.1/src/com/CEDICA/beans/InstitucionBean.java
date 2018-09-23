package com.CEDICA.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;
import org.primefaces.event.RowEditEvent; fsdfds

import com.CEDICA.dao.impl.InstitucionDao;
import com.CEDICA.dao.impl.RolDao;
import com.CEDICA.dao.impl.UsuarioDao;
import com.CEDICA.model.Institucion;
import com.CEDICA.model.Rol;
import com.CEDICA.model.Usuario;


public class InstitucionBean implements Serializable{
	private static final long serialVersionUID = 1L;	
	private Institucion institucion;
	private List<Institucion> lista;
	private List<Institucion> listaFiltrada;
	
	public InstitucionBean() {
		this.institucion = new Institucion();
		InstitucionDao insDao = new InstitucionDao();
		this.lista = insDao.list();
	}

	public Institucion getInstitucion() {
		return institucion;
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}

	public List<Institucion> getLista() {
		return lista;
	}

	public void setLista(List<Institucion> lista) {
		this.lista = lista;
	}

	public List<Institucion> getListaFiltrada() {
		return listaFiltrada;
	}
	
	public void nueva_institucion(ActionEvent event) {
		
		InstitucionDao instDao = new InstitucionDao();		
		RequestContext context = RequestContext.getCurrentInstance();
		UsuarioDao userDao = new UsuarioDao();
		FacesMessage message = null;		
		boolean exito = false;
		if((instDao.findByUsername(institucion.getUsername())==null) && (userDao.findByUsername(institucion.getUsername()) == null)){		
			instDao.save(this.institucion);
			this.lista.add(this.institucion);
			this.setListaFiltrada(this.lista);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Operación concretada...", "Institución '"+this.institucion.getNombre()+"' agregada correctamente.");
			exito = true;
		}else{
			message = new FacesMessage(FacesMessage.SEVERITY_WARN,"Atención!", "El nombre de usuario '"+this.institucion.getUsername()+"' ya existe en el sistema.");			
		}	
		FacesContext.getCurrentInstance().addMessage(null, message);
		context.addCallbackParam("exito", exito);
		context.addCallbackParam("view", "/views/administrador/listado_instituciones.xhtml");
	}

	public void setListaFiltrada(List<Institucion> listaFiltrada) {
		this.listaFiltrada = listaFiltrada;
	}
	
	public void onRowEdit(RowEditEvent event) {
		Institucion instActual = (Institucion) event.getObject();
		this.modificar_institucion(instActual);
        FacesMessage msg = new FacesMessage("Institución Editada", "Los cambios sobre la Institución '"+instActual.getNombre()+"' se realizaron correctamente.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        System.out.println(instActual.getUsername()+" - "+instActual.getPassword());
    }
	
	 public void onRowCancel(RowEditEvent event) {
	        FacesMessage msg = new FacesMessage("Edición Cancelada", ((Institucion) event.getObject()).getUsername());
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }  
	
	public void modificar_institucion(Institucion inst){
		InstitucionDao instDao = new InstitucionDao();		
		instDao.update(inst);		
	}
	
	public void borrar_institucion(Institucion i){
		InstitucionDao instDao = new InstitucionDao();		
		instDao.delete(i);
		this.lista.remove(i);
		this.setListaFiltrada(this.lista);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Operación concretada...", "La Institución '"+i.getNombre()+"' fue borrada correctamente."));
	}
}
