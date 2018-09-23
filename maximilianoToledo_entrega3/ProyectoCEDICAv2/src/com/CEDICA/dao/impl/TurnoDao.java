package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.ITurnoDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Turno;

public class TurnoDao extends GenericDaoHibernetJpaImpl<Turno> implements
		ITurnoDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Turno";
	 
		}

		
		public Turno findByTurnoname(String Turnoname) {
			return null;
		}

		
		public List<Turno> retrieveAllAdminTurno() {
			return null;
		}
	

}