package com.tbd.lab2.models;

/**
 * Clase que representa una institucion
 */
public class Institution {
    private Integer id_institution;
    private String name;
    private String name_coordinator;

    
    /** 
     * Obtiene el id (integer) de una Institucion
     * @return Integer
     */
    public Integer getId_institution() {
        return id_institution;
    }

    
    /** 
     * Modifica un id (integer) a una Institucion
     * @param id_institution
     */
    public void setId_institution(Integer id_institution) {
        this.id_institution = id_institution;
    }

    
    /** 
     * Obtiene el nombre (string) de una Institucion
     * @return String
     */
    public String getName() {
        return name;
    }

    
    /** 
     * Modifica el nombre (string) de una Institucion
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /** 
     * Obtiene el nombre del coordinador (string) de una Institucion
     * @return String
     */
    public String getName_coordinator() {
        return name_coordinator;
    }

    
    /** 
     * Modifica el nombre del coordinador (string) de una Institucion
     * @param name_coordinator
     */
    public void setName_coordinator(String name_coordinator) {
        this.name_coordinator = name_coordinator;
    }
    
    
    /** 
     * Retorna en un string los atributos de una institucion
     * @return String
     */
    @Override
    public String toString() {
        return "Institution{" +
                "id_institution=" + id_institution +
                ", name='" + name + '\'' +
                ", name_coordinator='" + name_coordinator + '\'' +
                '}';
    }
}
