package com.tbd.lab1.repositories;

import com.tbd.lab1.models.Emergency;

import java.util.List;

/**
 * Interface para EmergencyRepository.
 */
public interface EmergencyRepository {

    public List<Emergency> getAllEmergencies();

    public List<Emergency> getEmergencyById(int id);

    public Emergency createEmergency(Emergency emergency);

    public boolean editEmergency(Emergency emergency);

    public boolean deleteEmergency(int id);

    public int deleteAllEmergency();

    // public List<Emergency> obtieneEmergenciasPorRegion(Integer id);
}
