package test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Date;







import model.ItemsPresupuesto;
import model.Presupuesto;
import access.FactoryDAO;

public class ItemsPresupuestoTest {
	public static void main(String[] args) {

		FactoryDAO fDAO = new FactoryDAO().getFactory();


		
// PERSISTIR ITEMS

		List<ItemsPresupuesto> items_presupuesto = new ArrayList<ItemsPresupuesto>();
		
		
		for (int i=1;i<10;i++){
			
			String desc = new String("Item");
			desc = desc + i;

			Integer pre = i;
		
			
			String canti="no";
			ItemsPresupuesto ip = new ItemsPresupuesto(desc,pre,canti);
			
			items_presupuesto.add(ip);
		
			fDAO.getItemsPresupuestoDAO().guardar(ip);

		}
		
		Presupuesto p = new Presupuesto(items_presupuesto,"maxi","maxi@hotmAIL.COM");
		
		fDAO.getPresupuestoDAO().guardar(p);

		
//		// Obtengo todos los bares y los imprimo
		List<ItemsPresupuesto> item = (List<ItemsPresupuesto>) fDAO.getItemsPresupuestoDAO().listar();
		for (ItemsPresupuesto items : item) {
			System.out.println("Item : " + items.getId()+"\n");
			System.out.println("Descripcion : " + items.getDescripcion());
			System.out.println("Precio : " + items.getPrecio());
			System.out.println("-----------------------\n");
		}
		
/*		
		// Obtengo el objeto bar con id=8
		Bar b =(Bar) fDAO.getBarDAO().encontrar(8);
//		Medicamento m = fDAO.getMedicamentoDAO().encontrar(8);
		System.out.print(b.getNombre() + "\n");
		System.out.print(b.getDomicilio()+ "\n");
		System.out.print(b.getLocalidad()+ "\n");
		System.out.print(b.getDescripcion()+ "\n");
*/		
//		System.out.println("-----------------------\n");
//		
//		// Modifico el objeto Bar con id=8
//		b.setNombre("NUEVO BAR 8");
//		Date fechaModificacion = new Date();
//		b.setFechaModificacion(fechaModificacion);
//		fDAO.getBarDAO().modificar(b);
//		
//		System.out.println("-----------------------\n");		
//
//		// Obtengo todos los bares y los imprimo
//		bares = (List<Bar>) fDAO.getBarDAO().listar();
//		for (Bar bar : bares) {
//			System.out.println("Bar : " + bar.getNombre()+"\n");
//			System.out.println("Domicilio : " + bar.getDomicilio());
//			System.out.println("Localidad : " + bar.getLocalidad());
//			System.out.println("Descripcion : " + bar.getDescripcion());
//			System.out.println("-----------------------\n");
//		}	
//		
//		//Elimino el bar con id=5
//		fDAO.getBarDAO().eliminar(5);
//		System.out.println("-----------------------\n");
//		
//		// Obtengo todos los bares y los imprimo
//		bares = (List<Bar>) fDAO.getBarDAO().listar();
//		for (Bar bar : bares) {
//			System.out.println("Bar : " + bar.getNombre()+"\n");
//			System.out.println("Domicilio : " + bar.getDomicilio());
//			System.out.println("Localidad : " + bar.getLocalidad());
//			System.out.println("Descripcion : " + bar.getDescripcion());
//			System.out.println("-----------------------\n");
//		}	
	}

}
