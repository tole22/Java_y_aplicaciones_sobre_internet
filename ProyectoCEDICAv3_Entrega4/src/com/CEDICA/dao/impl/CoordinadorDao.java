package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ICoordinadorDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Coordinador;

public class CoordinadorDao extends GenericDaoHibernetJpaImpl<Coordinador> implements
		ICoordinadorDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Coordinador";
	 
		}

		
		public Coordinador findByCoordinadorname(String Coordinadorname) {
			return null;
		}

		
		public List<Coordinador> retrieveAllAdminCoordinador() {
			return null;
		}
	

}