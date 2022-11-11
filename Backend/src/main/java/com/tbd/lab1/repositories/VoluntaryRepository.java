package com.tbd.lab1.repositories;

import com.tbd.lab1.models.Voluntary;
import java.util.List;

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