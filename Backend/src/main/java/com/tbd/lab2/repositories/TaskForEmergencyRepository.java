package com.tbd.lab2.repositories;

import java.util.List;

import com.tbd.lab2.models.TaskForEmergency;

/**
 * Interface para TaskForEmergencyRepository
 */
public interface TaskForEmergencyRepository {
    public List<TaskForEmergency> getTaskVoluntary();
}
