package access;


import java.util.List;

import model.ItemsPresupuesto;
import model.Presupuesto;

public class PresupuestoDAO extends MySqlJPAFactoryDAO implements IPresupuestoDAO  {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List listar() {
		return super.listar(Presupuesto.class);
	}

	public void guardar(Object o) {
		super.guardarOActualizar(o);

	}

	public void modificar(Object o) {
		super.guardarOActualizar(o);
	}

	public Presupuesto encontrar(int id) {
		return (Presupuesto) super.encontrar(Presupuesto.class.getClass(), id);
	}

	public void eliminar(Object o) {
		super.eliminar(o);
	}

}
