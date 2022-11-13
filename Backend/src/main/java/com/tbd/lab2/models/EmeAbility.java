package com.tbd.lab2.models;

/**
 * Clase que representa una habilidad de emergencia
 */
public class EmeAbility {
    private Integer id_eme_ability;
    private Integer id_ability;
    private Integer id_emergency;

    /** 
     * Método que obtiene el id (Integer) de la habilidad de emergencia
     * @return Integer
     */
    public Integer getId_eme_ability() {
        return id_eme_ability;
    }
    
    /** 
     * Método que obtiene el id (Integer) de la habilidad
     * @return Integer
     */
    public Integer getId_ability() {
        return id_ability;
    }
    
    /** 
     * Método que obtiene el id (Integer) de la emergencia
     * @return Integer
     */
    public Integer getId_emergency() {
        return id_emergency;
    }
    
    /** 
     * Método que asigna el id (Integer) de la habilidad de emergencia
     * @param id_eme_ability
     */
    public void setId_eme_ability(Integer id_eme_ability) {
        this.id_eme_ability = id_eme_ability;
    }
    
    /** 
     * Método que asigna el id (Integer) de la habilidad
     * @param id_ability
     */
    public void setId_ability(Integer id_ability) {
        this.id_ability = id_ability;
    }
    
    /** 
     * Método que asigna el id (Integer) de la emergencia
     * @param id_emergency
     */
    public void setId_emergency(Integer id_emergency) {
        this.id_emergency = id_emergency;
    }
    
    /** 
     * Método que transforma todo el contenido de una habilidad de emrgencia
     * en un string
     * @return String
     */
    @Override
    public String toString() {
        return "emeAbility{" +
                "id_eme_ability=" + id_eme_ability +
                ", id_ability=" + id_ability +
                ", id_emergency=" + id_emergency +
                '}';
    }
}
