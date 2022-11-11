package com.tbd.lab1.models;

/**
 * Clase que representa una tarea
 */
public class Task {
    private Integer id_task;
    private String description;
    private Integer id_emergency;
    private Integer id_state_task;


    
    /** 
     * Método que obtiene el id (Integer) de la tarea
     * @return Integer
     */
    public Integer getId() {
        return id_task;
    }

    
    /** 
     * Método que asigna el id (Integer) de la tarea
     * @param id_task
     */
    public void setId(Integer id_task) {
        this.id_task = id_task;
    }

    
    /** 
     * Método que obtiene la descripción (String) de la tarea
     * @return String
     */
    public String getDescription() {
        return description;
    }

    
    /** 
     * Método que asigna la descripción (String) de la tarea
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    /** 
     * Método que obtiene el id (Integer) de la emergencia
     * @return Integer
     */
    public Integer getFk_emergency() {
        return id_emergency;
    }

    
    /** 
     * Método que asigna el id (Integer) de la emergencia
     * @param fk_emergency
     */
    public void setFk_emergency(Integer fk_emergency) {
        this.id_emergency = fk_emergency;
    }

    
    /** 
     * Método que obtiene el id (Integer) del estado de la tarea
     * @return Integer
     */
    public Integer getFk_state_task() {
        return id_state_task;
    }

    
    /** 
     * Método que asigna el id (Integer) del estado de la tarea
     * @param fk_state_task
     */
    public void setFk_state_task(Integer fk_state_task) {
        this.id_state_task = fk_state_task;
    }

    
    /** 
     * Método que transforma todo el contenido de una tarea en un string
     * @return String
     */
    @Override
    public String toString() {
        return "Task{" +
                "id_task=" + id_task +
                ", description='" + description + '\'' +
                ", fk_emergency=" + id_emergency +
                ", fk_state_task=" + id_state_task +
                '}';
    }
}
