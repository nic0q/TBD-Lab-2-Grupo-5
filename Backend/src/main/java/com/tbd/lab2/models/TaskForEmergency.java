package com.tbd.lab2.models;

/**
 * Clase que representa el retorno de una consulta
 */
public class TaskForEmergency {
    private Integer id_emergency;
    private String emergency_details;
    private Integer id_task;
    private String name_task;
    private Integer quantity;

    
    
    /**
     * Obtiene el id de una emergencia
     * @return Integer
     */
    public Integer getId_emergency() {
        return id_emergency;
    }

    
    /**
     * Obtiene los detalles de una emergencia
     * @return String
     */
    public String getEmergency_details() {
        return emergency_details;
    }

    
    /**
     * Obtiene el id de una tarea
     * @return Integer
     */
    public Integer getId_task() {
        return id_task;
    }

    
    /**
     * Obtiene el nombre de una tarea
     * @return String
     */
    public String getName_task() {
        return name_task;
    }

    
    /**
     * Obtiene la cantidad
     * @return Integer
     */
    public Integer getQuantity() {
        return quantity;
    }

    
    /**
     * Modifica el id de una emergencia
     * @param id_emergency
     */
    public void setId_emergency(Integer id_emergency) {
        this.id_emergency = id_emergency;
    }

    
    /**
     * Modifica los detalles de una emergencia
     * @param emergency_details
     */
    public void setEmergency_details(String emergency_details) {
        this.emergency_details = emergency_details;
    }

    
    /**
     * Modifica el id de una tarea
     * @param id_task
     */
    public void setId_task(Integer id_task) {
        this.id_task = id_task;
    }

    
    /**
     * Modifica el nombre de una tarea
     * @param name_task
     */
    public void setName_task(String name_task) {
        this.name_task = name_task;
    }

    
    /**
     * Modifica la cantidad
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    
    /**
     * Metodo que convierte a todo el objeto TaskForEmergency en String
     * @return String
     */
    @Override
    public String toString() {
        return "TaskForEmergency{" +
                ", id_emergency=" + id_emergency +
                ", emergency_details='" + emergency_details + '\'' +
                ", id_task=" + id_task +
                ", name_task='" + name_task + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
