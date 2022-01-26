package com.cg.placementmanagement.repository;

import java.util.List;

import com.cg.placementmanagement.entities.College;
public interface CollegeRepository {
	public void addCollege(College college);
	
	public List<College> searchCollege(int id);
	public List<College> getAllData();

	
	public College deleteCollege(int id3, College college);
	
	public College updateCollege(int id, College college);
	 
	public void startTransaction();
	public void endTransaction();


}
