package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ISedeDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Sede;

public class SedeDao extends GenericDaoHibernetJpaImpl<Sede> implements
		ISedeDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Sede";
	 
		}

		
		public Sede findBySedename(String Sedename) {
			return null;
		}

		
		public List<Sede> retrieveAllAdminSede() {
			return null;
		}
	

}