package com.tbd.lab2.models;

/**
 * Clase que representa el estado de una tarea
 */
public class StateTask {
    Integer id_state_task;
    String state;

    /**
     * Obtiene el id del estado de una tarea
     * @return Integer
     */
    public Integer getId_state_task() {
        return id_state_task;
    }

    /**
     * setea el id del estado de una tarea
     * @param id_state_task
     */
    public void setId_state_task(Integer id_state_task) {
        this.id_state_task = id_state_task;
    }

    /**
     * Obtiene el estado de una tarea
     * @return String
     */
    public String getState() {
        return state;
    }

    /**
     * setea el estado de una tarea
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Obtiene la informacion del estado de una tarea
     * @return String
     */
    @Override
    public String toString() {
        return "StateTask{" +
                "id_state_task=" + id_state_task +
                ", state='" + state + '\'' +
                '}';
    }
}
