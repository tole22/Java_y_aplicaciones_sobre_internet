package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ICaballoDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Caballo;

public class CaballoDao extends GenericDaoHibernetJpaImpl<Caballo> implements
		ICaballoDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Caballo";
	 
		}

		
		public Caballo findByCaballoname(String Caballoname) {
			return null;
		}

		
		public List<Caballo> retrieveAllAdminCaballo() {
			return null;
		}
	

}