package com.tbd.lab2.models;

/**
 * Clase que representa una tabla intermedia entre Voluntary y Ability
 */

public class VolAbility {
    private Integer id_vol_ability;
    private String voluntary_rut;
    private Integer id_ability;

    /**
     * Obtiene el id (integer) de una VolAbility
     * @return Integer
     */
    public Integer getId_vol_ability() {
        return id_vol_ability;
    }

    /**
     * Modifica un id (integer) a una VolAbility
     * @param id_vol_ability
     */
    public void setId_vol_ability(Integer id_vol_ability) {
        this.id_vol_ability = id_vol_ability;
    }

    /**
     * Obtiene el rut (String) de un Voluntario de una VolAbility
     * @return String
     */
    public String getVoluntary_rut() {
        return voluntary_rut;
    }

    /**
     * Modifica el rut (String) de un Voluntario de una VolAbility
     * @param voluntary_rut
     */
    public void setVoluntary_rut(String voluntary_rut) {
        this.voluntary_rut = voluntary_rut;
    }

    /**
     * Obtiene el id (integer) de una Habilidad de una VolAbility
     * @return Integer
     */
    public Integer getId_ability() {
        return id_ability;
    }

    /**
     * Modifica el id (integer) de una Habilidad de una VolAbility
     * @param id_ability
     */
    public void setId_ability(Integer id_ability) {
        this.id_ability = id_ability;
    }

    /**
     * Retorna una cadena con los atributos de una VolAbility
     * @return String
     */
    @Override
    public String toString() {
        return "VolAbility{" +
                "id_vol_ability=" + id_vol_ability +
                ", voluntary_rut=" + voluntary_rut +
                ", id_ability=" + id_ability +
                '}';
    }
}
