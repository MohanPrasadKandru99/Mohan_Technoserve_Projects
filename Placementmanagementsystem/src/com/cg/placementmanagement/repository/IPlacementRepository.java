package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entities.Placement;

public interface IPlacementRepository {
public Placement addPlacement(Placement placement);
public Placement updatePlacement(Placement placement);
public Placement searchPlacement(long id);
}
