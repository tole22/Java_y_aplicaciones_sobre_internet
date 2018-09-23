package access;


import java.util.List;

import model.ItemsPresupuesto;

public class ItemsPresupuestoDAO extends MySqlJPAFactoryDAO implements IItemsPresupuestoDAO {

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List listar() {
		return super.listar(ItemsPresupuesto.class);
	}

	public void guardar(Object o) {
		super.guardarOActualizar(o);

	}

	public void modificar(Object o) {
		super.guardarOActualizar(o);
	}

	public ItemsPresupuesto encontrar(int id) {
		return (ItemsPresupuesto) super.encontrar(ItemsPresupuesto.class.getClass(), id);
	}

	public void eliminar(Object o) {
		super.eliminar(o);
	}

	
}


