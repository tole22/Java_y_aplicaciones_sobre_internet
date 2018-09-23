package access;


import java.util.List;
import model.ItemsPresupuesto;

public interface IItemsPresupuestoDAO {
	@SuppressWarnings("rawtypes")
	public List listar();
	
	public void guardar(Object o);
	
	public void eliminar(Object o); 
	
	public ItemsPresupuesto encontrar(int idItemsPresupuesto);

	public void modificar(Object o);
}
