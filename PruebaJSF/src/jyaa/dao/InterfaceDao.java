package jyaa.dao;

import java.util.List;

import jyaa.modelo.ObjetoPersistente;



public interface InterfaceDao<T> {


	public void guardar(T entity);

	public void actualizar(T entity);
	
	public T obtener(Class<? extends ObjetoPersistente>nombreClase, Integer id);
	
	public void eliminar(T entity);
	
	public List<T> listar();
}
