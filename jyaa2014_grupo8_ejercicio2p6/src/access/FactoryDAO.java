package access;

import access.MySqlJPAFactoryDAO;
// import javax.persistence.*;

public class FactoryDAO {

    public FactoryDAO getFactory(){
                return new MySqlJPAFactoryDAO();
    }
	
	
	
	
	//Constructores
	
	public ItemsPresupuestoDAO getItemsPresupuestoDAO() {
		return new ItemsPresupuestoDAO();
	}
	public PresupuestoDAO getPresupuestoDAO() {
		return new PresupuestoDAO();
	}
	
	
}