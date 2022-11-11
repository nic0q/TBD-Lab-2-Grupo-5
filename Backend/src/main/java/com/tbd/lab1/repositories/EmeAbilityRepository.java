package com.tbd.lab1.repositories;

import com.tbd.lab1.models.EmeAbility;

import java.util.List;

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
