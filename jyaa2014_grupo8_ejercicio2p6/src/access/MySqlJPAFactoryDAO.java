package access;

import java.util.List;
import javax.persistence.*;

public class MySqlJPAFactoryDAO extends FactoryDAO {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jyaa2014_grupo8");
	private static EntityManager em = emf.createEntityManager();
    	
	//Funcionalidades
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Object> listar(Class clase) {
		return (em.createQuery("from "+clase.getName())).getResultList();
	}

	public void guardarOActualizar(Object o){
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
	}



	public Object encontrar(Class<?> clase, int id) {
		String id_field = (clase.getName()).toLowerCase();
		int i = id_field.lastIndexOf('.');
		id_field = id_field.substring(i+1);
		System.out.print("jpa encontrar\n");
		System.out.print("id: "+id+"\n");
		System.out.print("field: "+id_field+"\n");
		System.out.print("clase: "+clase.getName()+"\n");
		System.out.print("\n-----");
		return (Object) (em.createQuery("from "+ clase.getName()+" where id_"+id_field+"= " + id)).getSingleResult();
	}

	public void eliminar(Object o) {
		em.getTransaction().begin();
		em.remove(o);
		em.getTransaction().commit();
	}


}
