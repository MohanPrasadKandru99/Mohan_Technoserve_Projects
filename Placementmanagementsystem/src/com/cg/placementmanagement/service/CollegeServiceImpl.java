package com.cg.placementmanagement.service;

import java.util.List;

import com.cg.placementmanagement.entities.College;
import com.cg.placementmanagement.entities.Placement;
import com.cg.placementmanagement.repository.CollegeRepository;
import com.cg.placementmanagement.repository.CollegeRepositoryImpl;

public class CollegeServiceImpl implements CollegeService{
	CollegeRepository cri;
	
	public CollegeServiceImpl() {
		cri=new CollegeRepositoryImpl();
	}

	@Override
	public void addCollege(College college) {
		cri.startTransaction();
		cri.addCollege(college);
		cri.endTransaction();
	}
	
	@Override
	public List<College> searchCollege(int id) {
		return cri.searchCollege(id);
	}
	
	
	@Override
	public List<College> getAllData() {
		return cri.getAllData();
	}
	
	@Override
	public College updateCollege(int id, College c) {
		return cri.updateCollege(id,c);
	}

	@Override
	public College deleteCollege(int id3, College college) {

		return cri.deleteCollege(id3, college);
	}


	@Override
	public boolean schedulePlacement(Placement placement) {

		return false;
	}
}

