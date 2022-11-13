package com.tbd.lab2.repositories;

import java.util.List;

import com.tbd.lab2.models.VolAbility;

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
