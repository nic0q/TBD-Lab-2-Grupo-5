package com.tbd.lab1.repositories;

import com.tbd.lab1.models.Voluntary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

/**
 * Clase que implementa el repositorio para Voluntary.
 */
@Repository
public class VoluntaryRepositoryImp implements VoluntaryRepository{

  @Autowired
    private Sql2o sql2o;
    
    /** 
     * Método que retorna el número de voluntarios.
     * @return int
     */
    @Override
    public int countVoluntary() {
        int total = 0;
        try(Connection conn = sql2o.open()){
            total = conn.createQuery("SELECT COUNT(*) FROM \"Voluntary\"").executeScalar(Integer.class);
        }
        return total;
    }
    
    /** 
     * Método que retorna una lista con todos los voluntarios.
     * @return List<Voluntary>
     */
    @Override
    public List<Voluntary> getAllVoluntaries() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Voluntary\"")
                    .executeAndFetch(Voluntary.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    /** 
     * Método que ontiene un voluntario de la base de datos por su rut.
     * @param rut
     * @return List<Voluntary>
     */
    @Override
    public List<Voluntary> getVoluntaryByRut(String rut) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Voluntary\" WHERE rut = :rut")
                    .addParameter("rut", rut)
                    .executeAndFetch(Voluntary.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    /** 
     * Método que inserta un voluntario en la base de datos.
     * @param voluntary
     * @return Voluntary
     */
    @Override
    public Voluntary createVoluntary(Voluntary voluntary){
      try(Connection conn = sql2o.open()){
            conn.createQuery("INSERT INTO \"Voluntary\" (rut,name,age,avalaible)"+
            "values (:voluntaryRut,:voluntaryName,:voluntaryAge,:voluntaryAvalaible)")
                    .addParameter("voluntaryRut", voluntary.getRut())
                    .addParameter("voluntaryName", voluntary.getName())
                    .addParameter("voluntaryAge", voluntary.getAge())
                    .addParameter("voluntaryAvalaible", voluntary.getAvalaible())
                    .executeUpdate().getKey();
            return voluntary;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    /** 
     * Método que modifica un voluntario de la base de datos
     * @param voluntary
     * @return boolean
     */
    @Override
    public boolean editVoluntary(Voluntary voluntary) {
        try(Connection conn = sql2o.open()){
                conn.createQuery("UPDATE \"Voluntary\" SET name = :name, age = :age, avalaible = :avalaible WHERE rut = :rut")
                        .addParameter("rut", voluntary.getRut())
                        .addParameter("name", voluntary.getName())
                        .addParameter("age", voluntary.getAge())
                        .addParameter("avalaible", voluntary.getAvalaible())
                        .executeUpdate();
                return true;
            }catch(Exception e){
                System.out.println(e.getMessage());
                return false;
            }
    }
    
    /** 
     * Método que elimina un voluntario de la base de datos.
     * @param rut
     * @return boolean
     */
    @Override
    public boolean deleteVoluntary(String rut) {
        int deletedVoluntary;
        try(Connection conn = sql2o.open()){
            deletedVoluntary = conn.createQuery("DELETE FROM \"Voluntary\" WHERE rut = :rut")
                    .addParameter("rut", rut)
                    .executeUpdate().getResult();
        }
        return deletedVoluntary == 1;
    }

    /** 
     * Método que elimina todos los voluntarios de la base de datos.
     * @return int
     */
    @Override
    public int deleteAllVoluntary() {
        try(Connection conn = sql2o.open()){
            conn.createQuery("TRUNCATE \"Voluntary\" CASCADE")
                    .executeUpdate().getResult();
            return 1;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
}