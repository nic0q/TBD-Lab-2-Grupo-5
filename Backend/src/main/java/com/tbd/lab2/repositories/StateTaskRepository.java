package com.tbd.lab2.repositories;


import java.util.List;

import com.tbd.lab2.models.StateTask;

/**
 * Clase interfaz que representa el repositorio de tareas por estado
 */
public interface StateTaskRepository {

    public List<StateTask> getAllStateTask();

    public List<StateTask> getStateTaskById(Integer id);

    public StateTask createStateTask(StateTask stateTask);

    public boolean editStateTask(StateTask stateTask);
    
    public boolean deleteStateTask(Integer id);

    public boolean deleteAllStateTask();
}
