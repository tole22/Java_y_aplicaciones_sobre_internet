package jyaa.modelo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Persona {

	private String nombre;
	private String apellido;
	private int dni;
	private Date fechaNacimiento;

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public String toString() {

		return this.getNombre()+","+this.getApellido();
	}

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1960, Calendar.OCTOBER, 30);
				
		Persona p=new Persona();
		p.setNombre("diego");
		p.setApellido("maradona");
		p.setDni(14276579);
		p.setFechaNacimiento(cal.getTime());
		
		
		System.out.println(p);
		System.out.println("---------------------");
		System.out.println(p.getDni()); 
		System.out.println("---------------------");
		System.out.println(DateFormat.getDateInstance().format(p.getFechaNacimiento()));
	}

}
