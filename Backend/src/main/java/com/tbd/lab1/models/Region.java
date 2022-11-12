package com.tbd.lab1.models;

public class Region {
    private Integer gid;
    private String nom_reg;
    private String geom;

    /**
     * Obtiene el id (integer) de una Región
     * @return Integer
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * Modifica un id (integer) a una Región
     * @param gid
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * Obtiene el nombre (string) de una Región
     * @return String
     */
    public String getNom_reg() {
        return nom_reg;
    }

    /**
     * Modifica el nombre (string) de una Región
     * @param nom_reg
     */
    public void setNom_reg(String nom_reg) {
        this.nom_reg = nom_reg;
    }

    /**
     * Obtiene la geometría (string) de una Región
     * @return String
     */
    public String getGeom() {
        return geom;
    }

    /**
     * Modifica la geometría (string) de una Región
     * @param geom
     */
    public void setGeom(String geom) {
        this.geom = geom;
    }

    /**
     * Método que retorna un string con los atributos de la clase Region
     * @return String
     */
    @Override
    public String toString() {
        return "Region{" +
                "gid=" + gid +
                ", nom_reg='" + nom_reg + '\'' +
                ", geom='" + geom + '\'' +
                '}';
    }
}
