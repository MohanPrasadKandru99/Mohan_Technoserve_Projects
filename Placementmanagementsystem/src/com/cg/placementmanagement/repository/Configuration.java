package com.cg.placementmanagement.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Configuration {
	private static EntityManager em;
	private static EntityManagerFactory emf;
	static
	{
		emf=Persistence.createEntityManagerFactory("JPA-PU");
	}
	public static EntityManager createEntityManager()
	{
		em=emf.createEntityManager();
		return em;
	}
	
	

}
