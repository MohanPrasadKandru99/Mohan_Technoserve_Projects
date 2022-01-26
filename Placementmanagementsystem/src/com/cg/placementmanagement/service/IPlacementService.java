package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entities.Placement;

public interface IPlacementService {
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacement(long id);
	public boolean cancelPlacement(long id);
	
}
