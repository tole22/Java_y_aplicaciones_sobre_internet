package access;

import java.util.List;

import model.Presupuesto;

public interface IPresupuestoDAO {
	@SuppressWarnings("rawtypes")
	public List listar();
	
	public void guardar(Object o);
	
	public void eliminar(Object o); 
	
	public Presupuesto encontrar(int idPresupuesto);

	public void modificar(Object o);
}
