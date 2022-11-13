package com.tbd.lab2.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.tbd.lab2.models.VolAbility;

import java.util.List;

/**
 * Clase que implementa la interfaz VolAbilityRepository.
 */
@Repository
public class VolAbilityRepositoryImp implements VolAbilityRepository {

    @Autowired
    private Sql2o sql2o;

    
    /** 
     * Método que retorna una lista de todas las habilidades de los voluntarios
     * @return List<VolAbility>
     */
    @Override
    public List<VolAbility> getAllVolAbilities(){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Vol_ability\"").
                    executeAndFetch(VolAbility.class);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    
    /** 
     * Método que recibe un id y busca una habilidad de un voluntario en base a ese id,
     * en caso de que no exista retorna null.
     * @param id
     * @return List<VolAbility>
     */
    @Override
    public List<VolAbility> getVolAbilityById(int id){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Vol_ability\" WHERE id_vol_ability = :id")
                    .addParameter("id",id)
                    .executeAndFetch(VolAbility.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    
    /** 
     * Método que recibe volAbility como objeto y lo inserta en la base
     * de datos, agregando los atributos voluntary_rut y id_ability. Si la operación es exitosa
     * retorna el objeto de tipo VolAbility que se insertó, de lo contrario retorna null.
     * @param volAbility
     * @return VolAbility
     */
    @Override
    public VolAbility createVolAbility(VolAbility volAbility){
        try(Connection conn = sql2o.open()){
            int insertedId = (int) conn.createQuery("INSERT INTO \"Vol_ability\" (voluntary_rut, id_ability) VALUES (:voluntary_rut, :id_ability)", true)
                    .addParameter("voluntary_rut", volAbility.getVoluntary_rut())
                    .addParameter("id_ability", volAbility.getId_ability())
                    .executeUpdate()
                    .getKey();
            volAbility.setId_vol_ability(insertedId);
            return volAbility;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    
    /** 
     * Método que recibe un volAbility como objeto, busca la habilidad
     * de un voluntario en base a ese id y actualiza sus atributos con los del objeto recibido.
     * Si la operación es exitosa retorna true, de lo contrario retorna false.
     * @param volAbility
     * @return boolean
     */
    @Override
    public boolean editVolAbility(VolAbility volAbility){
        try(Connection conn = sql2o.open()){
            conn.createQuery("UPDATE \"Vol_ability\" SET voluntary_rut = :voluntary_rut, id_ability = :id_ability WHERE id_vol_ability = :id")
                    .addParameter("voluntary_rut", volAbility.getVoluntary_rut())
                    .addParameter("id_ability", volAbility.getId_ability())
                    .addParameter("id", volAbility.getId_vol_ability())
                    .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    
    /** 
     * Método que recibe un id y busca un volAbility en base a ese id,
     * en caso de que exista la elimina de la base de datos y retorna true, de lo contrario
     * retorna false.
     * @param id
     * @return boolean
     */
    @Override
    public boolean deleteVolAbility(int id){
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM \"Vol_ability\" WHERE id_vol_ability = :id")
                    .addParameter("id", id)
                    .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
