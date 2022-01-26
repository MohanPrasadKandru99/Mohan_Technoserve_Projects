package com.cg.placementmanagement.repository;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.placementmanagement.entities.College;

public class CollegeRepositoryImpl implements CollegeRepository{
	EntityManager em;

	public CollegeRepositoryImpl() {
		em=Configuration.createEntityManager();

	}
	
	@Override
	public void startTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void endTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void addCollege(College college) {
		em.persist(college);
	}
	
	@Override
	public List<College> searchCollege(int id) {
		
		String query="Select c from College c WHERE c.id like : id";
		TypedQuery<College> t=em.createQuery(query, College.class);
		t.setParameter("id", id);
		return t.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<College> getAllData() {
		Query query= em.createNamedQuery("getAllData");
		List<College> list= query.getResultList();
		return list;		
	}

	@Override
	public College updateCollege(int id, College college) {
		
		em.getTransaction().begin();
		College college1 = em.find(College.class, id);
		college1.setLocation("Online");
		em.getTransaction().commit();
		return college1;
	}
	
	@Override
	public College deleteCollege(int id3, College college) {
		
		em.getTransaction().begin();
		College college2 = em.find(College.class, id3);
		em.remove(college2);
		em.getTransaction().commit();
		return college2;
		
	}

}
