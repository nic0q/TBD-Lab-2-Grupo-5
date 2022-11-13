package com.tbd.lab2.repositories;

import java.util.List;

import com.tbd.lab2.models.EmeAbility;

/**
 * Clase interfaz que representa el repositorio de habilidades de emergencia
 */
public interface EmeAbilityRepository {

    public EmeAbility createEmeAbility(EmeAbility emeAbility);

    public List<EmeAbility> getAllEmeAbilities();

    public List<EmeAbility> getEmeAbilityById(int id);

    public boolean editEmeAbility(EmeAbility emeAbility);

    public boolean deleteEmeAbility(int id);

    public int deleteAllEmeAbility();
}
