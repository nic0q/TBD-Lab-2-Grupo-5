package com.tbd.lab2.repositories;

import java.util.List;

import com.tbd.lab2.models.Voluntary;

/**
 * Clase repositorio para Voluntary.
 */
public interface VoluntaryRepository {
  public int countVoluntary();

  public List<Voluntary> getAllVoluntaries();

  public Voluntary createVoluntary(Voluntary voluntary);

  public List<Voluntary> getVoluntaryByRut(String rut);

  public boolean deleteVoluntary(String rut);

  public boolean editVoluntary(Voluntary voluntary);

  public int deleteAllVoluntary();
}