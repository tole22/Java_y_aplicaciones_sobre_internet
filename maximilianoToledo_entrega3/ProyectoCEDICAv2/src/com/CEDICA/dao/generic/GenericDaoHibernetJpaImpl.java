package com.CEDICA.dao.generic;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.*;


public class GenericDaoHibernetJpaImpl<T> implements GenericDao<T> {
	public Class<T> domainClass = getDomainClass();
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jyaa_2014");	
	private static EntityManager em = emf.createEntityManager();
	
	@SuppressWarnings("unchecked")
	protected Class<T> getDomainClass() {
	   if (domainClass == null) {
		   ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
		   domainClass = (Class<T>) thisType.getActualTypeArguments()[0];
	   }
	  return domainClass;
	}
	
	public EntityManager getEntityManager(){
		return em;
	}
	
	@Override
	public void save(T entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}

	@Override
	public void delete(T entity) {
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();
	}

	@Override
	public void update(T entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}

	@Override
	public T findById(Serializable id) {
		return (T) em.find(domainClass,id);		
	}

	//El metodo getEntityName() es implementado por las subclases
	@SuppressWarnings("unchecked")
	@Override
	public List<T> list() {
		//...
		return em.createQuery("FROM " + domainClass.getName()).getResultList();		
	}
	
	

}
