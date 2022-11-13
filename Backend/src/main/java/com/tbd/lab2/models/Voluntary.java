package com.tbd.lab2.models;

/**
 * Clase que representa a un Voluntario.
 */
public class Voluntary {
    private String rut;
    private String name;
    private Integer age;
    private Boolean avalaible;

    
    /** 
     * Método que modifica el atributo rut (String).
     * @param rut
     */
    public void setRut(String rut) {
      this.rut = rut;
    }
    
    /** 
     * Método que modifica el atributo name (String)
     * @param name
     */
    public void setName(String name) {
      this.name = name;
    }
    
    /** 
     * Método que modifica el atributo age (Integer)
     * @param age
     */
    public void setAge(Integer age) {
      this.age = age;
    }
    
    /** 
     * Método que modifica el atributo avalaible (Boolean)
     * @param avalaible
     */
    public void setAvalaible(Boolean avalaible) {
      this.avalaible = avalaible;
    }
    
    /** 
     * Método que retorna el atributo rut (String)
     * @return String
     */
    public String getRut() {
        return rut;
    }
    
    /** 
     * Método que retorna el atributo name (String)
     * @return String
     */
    public String getName() {
        return name;
    }
    
    /** 
     * Método que retorna el atributo age (Integer)
     * @return Integer
     */
    public Integer getAge() {
        return age;
    }
    
    /** 
     * Método que retorna el atributo avalaible (Boolean)
     * @return Boolean
     */
    public Boolean getAvalaible() {
        return avalaible;
    }
}
