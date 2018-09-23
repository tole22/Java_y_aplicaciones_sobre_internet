package com.CEDICA.dao;

import com.CEDICA.dao.generic.GenericDao;
import com.CEDICA.model.Institucion;


public interface IInstitucionDao extends GenericDao<Institucion> {
	
	public Institucion findByUsername(String username);
}
