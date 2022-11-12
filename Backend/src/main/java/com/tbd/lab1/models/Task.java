package com.tbd.lab1.models;


public class Task {
    private Integer id_task;
    private String description;
    private Integer id_emergency;
    private Integer id_state_task;
    private Double  latitud;
    private Double longitud;

    /**
     * Obtiene el id (integer) de una tarea
     * @return Integer
     */
    public Integer getId() {
        return id_task;
    }

    /**
     * Modifica un id (integer) a una tarea
     * @param id_task
     */
    public void setId(Integer id_task) {
        this.id_task = id_task;
    }

    /**
     * Obtiene la descripción (string) de una tarea
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Modifica la descripción (string) de una tarea
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtiene el id de la emergencia (integer) de una tarea
     * @return Integer
     */
    public Integer getFk_emergency() {
        return id_emergency;
    }

    /**
     * Modifica el id de la emergencia (integer) de una tarea
     * @param fk_emergency
     */
    public void setFk_emergency(Integer fk_emergency) {
        this.id_emergency = fk_emergency;
    }

    /**
     * Obtiene el id del estado de la tarea (integer) de una tarea
     * @return Integer
     */
    public Integer getFk_state_task() {
        return id_state_task;
    }

    /**
     * Modifica el id del estado de la tarea (integer) de una tarea
     * @param fk_state_task
     */
    public void setFk_state_task(Integer fk_state_task) {
        this.id_state_task = fk_state_task;
    }

    /**
     * Obtiene la latitud (double) de una tarea
     * @return Double
     */
    public Double getLatitud() {
        return latitud;
    }

    /**
     * Modifica la latitud (double) de una tarea
     * @param latitud
     */
    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    /**
     * Obtiene la longitud (double) de una tarea
     * @return Double
     */
    public Double getLongitud() {
        return longitud;
    }

    /**
     * Modifica la longitud (double) de una tarea
     * @param longitud
     */
    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    /**
     * Obtiene el estado (string) de una tarea
     * @return String
     */
    @Override
    public String toString() {
        return "Task{" +
                "id_task=" + id_task +
                ", description='" + description + '\'' +
                ", id_emergency=" + id_emergency +
                ", id_state_task=" + id_state_task +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}
