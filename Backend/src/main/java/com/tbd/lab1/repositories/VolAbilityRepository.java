package com.tbd.lab1.repositories;

import com.tbd.lab1.models.VolAbility;

import java.util.List;

/**
 * Interface para VolAbilityRepository.
 */
public interface VolAbilityRepository {
    public List<VolAbility> getAllVolAbilities();

    public List<VolAbility> getVolAbilityById(int id);

    public VolAbility createVolAbility(VolAbility volAbility);

    public boolean editVolAbility(VolAbility volAbility);

    public boolean deleteVolAbility(int id);
}
