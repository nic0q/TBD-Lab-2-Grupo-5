package com.tbd.lab2.repositories;

import java.util.List;

import com.tbd.lab2.models.Emergency;

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

    public List<Emergency> obtieneEmergenciasPorRegion(Integer id);
}
