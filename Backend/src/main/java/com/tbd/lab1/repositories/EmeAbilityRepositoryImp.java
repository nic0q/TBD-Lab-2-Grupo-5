package com.tbd.lab1.repositories;

import com.tbd.lab1.models.EmeAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

/**
 * Clase que implementa la interfaz EmeAbilityRepository
 */
@Repository
public class EmeAbilityRepositoryImp implements EmeAbilityRepository{
    @Autowired
    private Sql2o sql2o;
    
    /** 
     * Método que crea una habilidad de emergencia
     * @param emeAbility
     * @return EmeAbility
     */
    @Override
    public EmeAbility createEmeAbility(EmeAbility emeAbility) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("INSERT INTO \"Eme_ability\" (id_ability, id_emergency) "+
                            "VALUES (:id_ability, :id_emergency)")
                    .addParameter("id_ability", emeAbility.getId_ability())
                    .addParameter("id_emergency", emeAbility.getId_emergency())
                    .executeUpdate().getKey();
            return emeAbility;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    /** 
     * Método que retorna todas las habilidades de emergencia
     * @return List<EmeAbility>
     */
    @Override
    public List<EmeAbility> getAllEmeAbilities() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Eme_ability\"").
                    executeAndFetch(EmeAbility.class);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    /** 
     * Método que retorna una habilidad de emergencia por id
     * @param id
     * @return List<EmeAbility>
     */
    @Override
    public List<EmeAbility> getEmeAbilityById(int id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Eme_ability\" WHERE id_eme_ability = :id")
                    .addParameter("id", id)
                    .executeAndFetch(EmeAbility.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    /** 
     * Método que edita una habilidad de emergencia
     * @param emeAbility
     * @return boolean
     */
    @Override
    public boolean editEmeAbility(EmeAbility emeAbility) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("UPDATE \"Eme_ability\" SET id_ability = :id_ability, id_emergency = :id_emergency WHERE id_eme_ability = :id_eme_ability")
                    .addParameter("id_eme_ability", emeAbility.getId_eme_ability())
                    .addParameter("id_ability", emeAbility.getId_ability())
                    .addParameter("id_emergency", emeAbility.getId_emergency())
                    .executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    /** 
     * Método que elimina una habilidad de emergencia por id
     * @param id
     * @return boolean
     */
    @Override
    public boolean deleteEmeAbility(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM \"Eme_ability\" WHERE id_eme_ability = :id")
                    .addParameter("id", id)
                    .executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    /** 
     * Método que elimina todas las habilidades de emergencia
     * @return int
     */
    @Override
    public int deleteAllEmeAbility(){
        try(Connection conn = sql2o.open()){
            conn.createQuery("TRUNCATE \"Eme_ability\" CASCADE")
                    .executeUpdate();
            return 1;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
