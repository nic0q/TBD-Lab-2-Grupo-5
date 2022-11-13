package com.tbd.lab2.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.tbd.lab2.models.Ability;

import java.util.List;

/**
 * Clase que implementa la interfaz AbilityRepository
 */
@Repository
public class AbilityRepositoryImp implements AbilityRepository {

    @Autowired
    private Sql2o sql2o;
    /**
     * Método que retorna una lista de todas las tablas de Ability
     * @return List<Ability>
     */
    @Override
    public List<Ability> getAllAbilities() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Ability\"").
                    executeAndFetch(Ability.class);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    /**
     * Metodo que retorna un objeto de tipo Ability, dado un id
     * @return List<Ability>
     */
    @Override
    public List<Ability> getAbilityById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Ability\" WHERE id_ability = :id")
                    .addParameter("id",id)
                    .executeAndFetch(Ability.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    /**
     * Método que recibe un objeto de tipo Ability y lo inserta en la base de datos.
     * si no se pudo insertar retorna null.
     * @param ability
     * @return Ability
     */
    @Override
    public Ability createAbility(Ability ability) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("INSERT INTO \"Ability\" (name_ability, description_ability) " +
            "VALUES (:name_ability,:description_ability)")
                    .addParameter("name_ability", ability.getName_ability())
                    .addParameter("description_ability", ability.getDescription_ability())
                    .executeUpdate().getKey();
            return ability;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    /**
     * Método que recibe un objeto de tipo Ability y lo actualiza en la base de datos mediante su id.
     * si no se pudo actualizar retorna false.
     * @param ability
     * @return boolean
     */
    @Override
    public boolean editAbility(Ability ability) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("UPDATE \"Ability\" SET name_ability = :name_ability, description_ability = :description_ability WHERE id_ability = :id_ability")
                    .addParameter("name_ability", ability.getName_ability())
                    .addParameter("description_ability", ability.getDescription_ability())
                    .addParameter("id_ability", ability.getId_ability())
                    .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    /**
     * Método que recibe un id de tipo Integer y elimina un objeto de tipo Ability de la base de datos.
     * si no se pudo eliminar retorna false.
     * @param id
     * @return boolean
     */
    @Override
    public boolean deleteAbility(Integer id) {
        int deletedAbility;
        try(Connection conn = sql2o.open()){
            deletedAbility = conn.createQuery("DELETE FROM \"Ability\" WHERE id_ability = :id")
                    .addParameter("id", id)
                    .executeUpdate().getResult();
        }
        return deletedAbility == 1;
    }

    /**
     * Método elimina todas las abilities de la base de datos.
     * @return Integer
     */
    @Override
    public int deleteAllAbility(){
        try(Connection conn = sql2o.open()){
            conn.createQuery("TRUNCATE \"Ability\" CASCADE")
                    .executeUpdate();
            return 1;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
