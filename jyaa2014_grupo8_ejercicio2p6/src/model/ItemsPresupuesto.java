package model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="ITEMSPRESUPUESTO")

public class ItemsPresupuesto {

	@Id @GeneratedValue
	@Column(name="IP_ID")
	private Long id;
	private String descripcion;
	private Integer precio ;
	private String compra_por_cantidad;
	
	@ManyToMany(mappedBy="items")
	private List<Presupuesto> presupuestos;
	
	public ItemsPresupuesto(){ }
	
	public ItemsPresupuesto(String descrip, Integer precio, String cant){
		this.setDescripcion(descrip);
		this.setPrecio(precio);
		this.setCompra_por_cantidad(cant);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getCompra_por_cantidad() {
		return compra_por_cantidad;
	}

	public void setCompra_por_cantidad(String compra_por_cantidad) {
		this.compra_por_cantidad = compra_por_cantidad;
	}
	
}
