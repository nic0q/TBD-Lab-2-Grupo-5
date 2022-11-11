package com.tbd.lab1.repositories;


import com.tbd.lab1.models.StateTask;

import java.util.List;

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
