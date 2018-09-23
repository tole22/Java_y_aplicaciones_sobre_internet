package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.IVoluntarioDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Voluntario;

public class VoluntarioDao extends GenericDaoHibernetJpaImpl<Voluntario> implements
		IVoluntarioDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Voluntario";
	 
		}

		
		public Voluntario findByVoluntarioname(String Voluntarioname) {
			return null;
		}

		
		public List<Voluntario> retrieveAllAdminVoluntario() {
			return null;
		}
	

}