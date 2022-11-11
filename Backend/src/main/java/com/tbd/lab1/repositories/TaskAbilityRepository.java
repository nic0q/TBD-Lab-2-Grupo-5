package com.tbd.lab1.repositories;

import com.tbd.lab1.models.TaskAbility;

import java.util.List;

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