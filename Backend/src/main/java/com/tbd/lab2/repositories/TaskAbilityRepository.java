package com.tbd.lab2.repositories;

import java.util.List;

import com.tbd.lab2.models.TaskAbility;

/**
 * Interface para TaskAbilityRepository.
 */
public interface TaskAbilityRepository {

    public TaskAbility createTaskAbility(TaskAbility taskAbility);

    public List<TaskAbility> getAllTaskAbilities();

    public List<TaskAbility> getTaskAbilityById(int id);

    public boolean editTaskAbility(TaskAbility taskAbility);

    public boolean deleteTaskAbility(int id);
}