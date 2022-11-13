package com.tbd.lab2.repositories;

import java.util.List;

import com.tbd.lab2.models.Region;

/**
 * Interface para RegionRepository
 */
public interface RegionRepository {
    public List<Region> getAllRegions();
    public List<Region> getRegionById(int id);
    public Region createRegion(Region region);
    public boolean editRegion(Region region);
    public boolean deleteRegion(int id);
    public int deleteAllRegion();
}
