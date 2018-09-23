package jyaa.backingBeans;



import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import jyaa.modelo.Persona;
import jyaa.servicios.RegistrarPersonaService;

@ManagedBean(name="registrarBean")
@RequestScoped
public class RegistrarPersonaBackingBean {
	
	
	private String apellido;
	private String nombre;
	private String email;
	private Date fechaNacimiento;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String registrar(){
		System.out.println("Se comienza el guardado");
		RegistrarPersonaService servicio=new RegistrarPersonaService();
		servicio.registrarPersona(this.getNombre(), this.getApellido(), this.getFechaNacimiento(),this.getEmail());
		System.out.println("Se guardó con exito");
		return "exito";
	}
	
	public List<Persona> getListaPersonas(){
		RegistrarPersonaService servicio=new RegistrarPersonaService();
		return servicio.getListaPersonas();
	}
}
