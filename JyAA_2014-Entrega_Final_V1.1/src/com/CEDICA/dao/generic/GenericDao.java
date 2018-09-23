package com.CEDICA.dao.generic;

import java.io.Serializable;
import java.util.List;


//Define la interface que sera super interfaces de todas, para ello utiliza genericos

public interface GenericDao<T>{
	
	public void save(T entity);
	public void delete(T entity);
	public void update(T entity);
	public T findById(Serializable id);	
	public List<T> list();

}

