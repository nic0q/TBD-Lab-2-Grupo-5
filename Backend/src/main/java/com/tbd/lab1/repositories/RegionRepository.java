package com.tbd.lab1.repositories;

import com.tbd.lab1.models.Region;

import java.util.List;

public interface RegionRepository {
    public List<Region> getAllRegions();
    public List<Region> getRegionById(int id);
    public Region createRegion(Region region);
    public boolean editRegion(Region region);
    public boolean deleteRegion(int id);
    public int deleteAllRegion();
}
