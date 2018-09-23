package com.CEDICA.dao;

import com.CEDICA.dao.generic.GenericDao;
import com.CEDICA.model.Alumno;

public interface IAlumnoDao extends GenericDao<Alumno> {
	
	public Alumno findByDNI(Integer dni);
}
