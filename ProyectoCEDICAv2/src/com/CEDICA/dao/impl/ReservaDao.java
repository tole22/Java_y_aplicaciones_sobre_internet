package com.CEDICA.dao.impl;

import java.util.List;


import com.CEDICA.dao.IReservaDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Reserva;

public class ReservaDao extends GenericDaoHibernetJpaImpl<Reserva> implements
		IReservaDao {

	//Este metodo es utilizado por GenericDAOHibernateJPAImpl<T> para el caso de necesitar el nombre de la clase
		public String getEntityName(){
		  return "Reserva";
	 
		}

		
		public Reserva findByReservaname(String Reservaname) {
			return null;
		}

		
		public List<Reserva> retrieveAllAdminReserva() {
			return null;
		}
	

}