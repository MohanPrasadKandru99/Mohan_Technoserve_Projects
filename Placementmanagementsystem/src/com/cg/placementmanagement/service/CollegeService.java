package com.cg.placementmanagement.service;

import java.util.List;

import com.cg.placementmanagement.entities.College;
import com.cg.placementmanagement.entities.Placement;

public interface CollegeService {
	public void addCollege(College college);
	public List<College> searchCollege(int id);
	public College deleteCollege(int id3, College college);
	public boolean schedulePlacement(Placement placement);
	public List<College> getAllData();
	public College updateCollege(int id2, College college);
}
