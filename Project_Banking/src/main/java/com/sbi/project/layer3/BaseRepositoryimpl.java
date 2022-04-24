package com.sbi.project.layer3;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
public class BaseRepositoryimpl implements BaseRepository {
		
	@PersistenceContext
	EntityManager entityManager;
	
	public BaseRepositoryimpl()
	{
		System.out.println("BaseRepostiroyImple()..........");		
	}
	
	
	public void persist(Object obj) //user defined function
	{
		entityManager.persist(obj);
	}
	

	public void remove(Object obj)   //user defined function
	{
			entityManager.remove(obj);   //ORM's remove 
	}
	

	public void merge(Object obj) //user defined function
	{
			entityManager.merge(obj);
	}
	

	public <AnyType> AnyType find(Class<AnyType> classname,Serializable primaryKey)  //user defined function
	{
			AnyType e = entityManager.find(classname, primaryKey);
			return e;
	}
	


	public <AnyType> List<AnyType> findAll(String entityName,Class<AnyType> classname) 
	{	
		TypedQuery<AnyType> typedQuery = entityManager.createQuery("from " +entityName,classname);
		return typedQuery.getResultList();
		
			//Query query = entityManager.createQuery("from " +entityName);
			//return query.getResultList();
	}


	
	
	
	
	
}
