package com.cg.DBUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Db {

	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	static{
		factory= Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public EntityManager getManager() {
		if(entityManager==null || !entityManager.isOpen())
			entityManager=factory.createEntityManager();
		else
			getManager();
		return entityManager;
	}  
}
