package com.tbd.lab1.repositories;

import com.tbd.lab1.models.Ability;

import java.util.List;

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
