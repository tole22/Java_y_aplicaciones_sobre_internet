package com.CEDICA.dao;

import java.util.List;

import com.CEDICA.dao.generic.GenericDao;
import com.CEDICA.model.Solicitud;

public interface ISolicitudDao extends GenericDao<Solicitud> {
	
	public List<Solicitud> listByEstado(String estado);

}
