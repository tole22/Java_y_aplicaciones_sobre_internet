package model;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import model.ItemsPresupuesto;

@Entity
@Table(name="PRESUPUESTO")
public class Presupuesto {

	@Id @GeneratedValue
	@Column(name="P_ID")
	private Long id;
	
	@ManyToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
	@JoinTable(name="presupuestoToItem", joinColumns={@JoinColumn(name="P_ID", referencedColumnName="P_ID")}, inverseJoinColumns={@JoinColumn(name="IP_ID", referencedColumnName="IP_ID")})
	private List<ItemsPresupuesto>items;
	
	private String nombre;
	
	private String email;
	
	public Presupuesto(){ }
	
	public Presupuesto(List<ItemsPresupuesto> items, String nombre, String email){
		this.setItems(items);
		this.setNombre(nombre);
		this.setEmail(email);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ItemsPresupuesto> getItems() {
		return items;
	}

	public void setItems(List<ItemsPresupuesto> items) {
		this.items = items;
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
}
