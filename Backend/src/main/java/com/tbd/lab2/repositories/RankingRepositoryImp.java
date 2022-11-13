package com.tbd.lab2.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.tbd.lab2.models.Ranking;

import java.util.List;

/**
 * Clase que implementa la interfaz RankingRepository.
 */
@Repository
public class RankingRepositoryImp implements RankingRepository{
    
    @Autowired
    private Sql2o sql2o;

    /** 
     * Método que retorna una lista de todos los rankings
     * @return List<Ranking>
     */
    @Override
    public List<Ranking> getAllRankings() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Ranking\"").
                    executeAndFetch(Ranking.class);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /** 
     * Método que recibe un id y busca un ranking especifico. Si el ranking
     * existe entonces lo retorna, de lo contrario retorna null.
     * @param id
     * @return List<Ranking>
     */
    @Override
    public List<Ranking> getRankingById(int id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Ranking\" WHERE id_ranking = :id")
                    .addParameter("id",id)
                    .executeAndFetch(Ranking.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /** 
     * Método que recibe un Ranking como obejto y lo inserta en la base de datos.
     * Luego agrega los atributos especificados en la tabla de la base de datos. Retorna
     * el objeto de tipo Ranking que se insertó. Si no se pudo insertar retorna null.
     * @param ranking
     * @return Ranking
     */
    @Override
    public Ranking createRanking(Ranking ranking) {
        try(Connection conn = sql2o.open()){
            int insertedId = (int) conn.createQuery("INSERT INTO \"Ranking\" (id_task, rut_voluntary) VALUES (:id_task, :rut_voluntary)", true)
                    .addParameter("id_task", ranking.getId_task())
                    .addParameter("rut_voluntary", ranking.getRut_voluntary())
                    .executeUpdate()
                    .getKey();
            ranking.setId_ranking(insertedId);
            return ranking;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /** 
     * Método que recibe un Ranking como objeto y lo actualiza en la base de datos.
     * Luego actualiza los atributos especificados en la tabla de la base de datos. Retorna
     * el objeto de tipo Ranking que se actualizó. Si no se pudo actualizar retorna null.
     * @param ranking
     * @return boolean
     */
    @Override
    public boolean editRanking(Ranking ranking) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("UPDATE \"Ranking\" SET id_task = :id_task, rut_voluntary = :rut_voluntary WHERE id_ranking = :id_ranking")
                    .addParameter("id_task", ranking.getId_task())
                    .addParameter("rut_voluntary", ranking.getRut_voluntary())
                    .addParameter("id_ranking", ranking.getId_ranking())
                    .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    /** 
     * Método que recibe un id y elimina un ranking especifico. Si el ranking
     * existe entonces lo elimina, de lo contrario retorna false.
     * @param id
     * @return boolean
     */
    @Override
    public boolean deleteRanking(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM \"Ranking\" WHERE id_ranking = :id_ranking")
                    .addParameter("id_ranking", id)
                    .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    

    
    /** 
     * Método que elimina todos los rankings de la base de datos
     * @return boolean
     */
    @Override
    public boolean deleteAllRanking() {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM \"Ranking\"")
                    .executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

}
