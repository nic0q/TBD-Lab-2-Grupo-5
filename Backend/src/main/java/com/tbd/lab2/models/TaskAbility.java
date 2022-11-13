package com.tbd.lab2.models;

/**
 * Clase que representa tabla intermediaria entre Task y Ability
 */
public class TaskAbility {
    private Integer id_task_ability;
    private Integer id_task;
    private Integer id_eme_ability;

    /** 
     * Obtiene el id (integer) de una TaskAbility
     * @return Integer
     */
    public Integer getId_task_ability() {
        return id_task_ability;
    }

    /** 
     * Obtiene el id (integer) de una Task
     * @return Integer
     */
    public Integer getId_task() {
        return id_task;
    }

    /** 
     * Obtiene el id (integer) de una Ability
     * @return Integer
     */
    public Integer getId_eme_ability() {
        return id_eme_ability;
    }

    /** 
     * Modifica el id (integer) de una TaskAbility
     * @param id_task_ability
     */
    public void setId_task_ability(Integer id_task_ability) {
        this.id_task_ability = id_task_ability;
    }

    /** 
     * Modifica el id (integer) de una Task
     * @param id_task
     */
    public void setId_task(Integer id_task) {
        this.id_task = id_task;
    }

    /** 
     * Modifica el id (integer) de una Ability
     * @param id_eme_ability
     */
    public void setId_eme_ability(Integer id_eme_ability) {
        this.id_eme_ability = id_eme_ability;
    }

    /** 
     * Constructor de la clase TaskAbility, retorna un String con los atributos de la clase TaskAbility
     * @return String
     */
    @Override
    public String toString() {
        return "taskAbility{" +
                "id_task_ability=" + id_task_ability +
                ", id_task=" + id_task +
                ", id_eme_ability=" + id_eme_ability +
                '}';
    }
}
