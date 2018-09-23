package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.IFamiliarDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Familiar;

public class FamiliarDao extends GenericDaoHibernetJpaImpl<Familiar> implements
		IFamiliarDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Familiar";
	 
		}

		
		public Familiar findByFamiliarname(String Familiarname) {
			return null;
		}

		
		public List<Familiar> retrieveAllAdminFamiliar() {
			return null;
		}
	

}