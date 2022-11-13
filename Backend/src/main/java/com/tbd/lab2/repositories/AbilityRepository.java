package com.tbd.lab2.repositories;

import java.util.List;

import com.tbd.lab2.models.Ability;

/**
 * Clase interfaz que representa el repositorio de habilidades
 */
public interface AbilityRepository {

    public List<Ability> getAllAbilities();

    public List<Ability> getAbilityById(Integer id);

    public Ability createAbility(Ability ability);

    public boolean editAbility(Ability ability);

    public boolean deleteAbility(Integer id);

    public int deleteAllAbility();

}
