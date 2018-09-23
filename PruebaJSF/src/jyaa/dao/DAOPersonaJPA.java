package jyaa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import jyaa.modelo.Persona;

public class DAOPersonaJPA extends DAOGenericoJPA<Persona> implements DaoPersona {

	@Override
	public List<Persona> listar() {
		
		EntityManager em=getEntityManagerFactory().createEntityManager();
		String query = "select u from Persona u";
		List<Persona> list = (ArrayList<Persona>)(em.createQuery(query)).getResultList();
		em.close();
		return list;
	}

}
