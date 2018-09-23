package com.CEDICA.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.CEDICA.dao.IAlumnoDao;
import com.CEDICA.dao.generic.GenericDaoHibernetJpaImpl;
import com.CEDICA.model.Alumno;
import com.CEDICA.model.Usuario;

public class AlumnoDao extends GenericDaoHibernetJpaImpl<Alumno> implements
		IAlumnoDao {

	public Alumno findByDNI(Integer dni){
		Query query = this.getEntityManager().createQuery("SELECT a FROM Alumno a WHERE a.dni = :dni");
		query.setParameter("dni", dni);
		try{
			return (Alumno) query.getSingleResult();	
		}catch(NoResultException nre ) {  
	        return null;  
	    }  
	}

}
