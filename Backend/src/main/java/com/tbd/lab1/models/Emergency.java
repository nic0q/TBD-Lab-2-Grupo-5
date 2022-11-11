package com.tbd.lab1.models;

/**
 * Clase que representa una emergencia
 */
public class Emergency{
    private Integer id_emergency;
    private String emergency_details;
    private String status;
    private Integer id_institution;

    
    /** 
     * Obtiene el id (integer) de una Emergencia
     * @return Integer
     */
    public Integer getId_emergency() {
        return id_emergency;
    }

    
    /** 
     * Modifica un id (integer) a una Emergencia
     * @param id_emergency
     */
    public void setId_emergency(Integer id_emergency) {
        this.id_emergency = id_emergency;
    }

    
    /** 
     * Obtiene los detalles (string) de una Emergencia
     * @return String
     */
    public String getEmergency_details() {
        return emergency_details;
    }

    
    /** 
     * Modifica los detalles (string) de una Emergencia
     * @param emergency_details
     */
    public void setEmergency_details(String emergency_details) {
        this.emergency_details = emergency_details;
    }

    
    /** 
     * Obtiene el estado (string) de una Emergencia
     * @return String
     */
    public String getStatus() {
        return status;
    }

    
    /** 
     * Modifica el estado (string) de una Emergencia
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    
    /** 
     * Obtiene el id de la institución (integer) de una Emergencia
     * @return Integer
     */
    public Integer getId_institution() {
        return id_institution;
    }

    
    /** 
     * Modifica el id de la institución (integer) de una Emergencia
     * @param id_institution
     */
    public void setId_institution(Integer id_institution) {
        this.id_institution = id_institution;
    }

    
    /** 
     * Método que retorna un string con los atributos de la clase Emergency
     * @return String
     */
    @Override
    public String toString() {
        return "Emergency{" +
                "id_emergency=" + id_emergency +
                ", emergency_details='" + emergency_details + '\'' +
                ", status='" + status + '\'' +
                ", id_institution=" + id_institution +
                '}';
    }
}
