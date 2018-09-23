package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.IGrillaDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Grilla;

public class GrillaDao extends GenericDaoHibernetJpaImpl<Grilla> implements
		IGrillaDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Grilla";
	 
		}

		
		public Grilla findByGrillaname(String Grillaname) {
			return null;
		}

		
		public List<Grilla> retrieveAllAdminGrilla() {
			return null;
		}
	

}