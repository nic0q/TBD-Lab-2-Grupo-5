package com.tbd.lab1.repositories;

import com.tbd.lab1.models.TaskAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

/**
 * Clase que implementa la interfaz TaskAbilityRepository.
 */
@Repository
public class TaskAbilityRepositoryImp implements TaskAbilityRepository{

    @Autowired
    private Sql2o sql2o;

    /** 
     * Método que recibe un objeto de tipo TaskAbility y lo inserta en la base de datos.
     * Luego, agrega los atributos especificados en la tabla TaskAbility de la base de datos. 
     * Retorna el objeto de tipo TaskAbility que se insertó. Si no se pudo insertar retorna null.
     * @param taskAbility
     * @return TaskAbility
     */
    @Override
    public TaskAbility createTaskAbility(TaskAbility taskAbility) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("INSERT INTO \"Task_ability\" (id_task, id_eme_ability) "+
                            "VALUES (:id_task, :id_eme_ability)")
                    .addParameter("id_task", taskAbility.getId_task())
                    .addParameter("id_eme_ability", taskAbility.getId_eme_ability())
                    .executeUpdate().getKey();
            return taskAbility;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /** 
     * Método que retorna una lista de todas las tablas de TaskAbility
     * @return List<TaskAbility>
     */
    @Override
    public List<TaskAbility> getAllTaskAbilities(){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Task_ability\"").
                    executeAndFetch(TaskAbility.class);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /** 
     * Método que recibe un id para que, mediante este, se logre buscar una tabla de TaskAbility en especifico.
     * Retorna la tabla de TaskAbility. Si no se encuentra retorna null.
     * @param id
     * @return List<TaskAbility>
     */
    @Override
    public List<TaskAbility> getTaskAbilityById(int id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"Task_ability\" WHERE id_task_ability = :id")
                    .addParameter("id", id)
                    .executeAndFetch(TaskAbility.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /** 
     * Método que recibe un objeto de tipo TaskAbility y lo actualiza en la base de datos.
     * Modifica los atributos especificados en la tabla TaskAbility de la base de datos.
     * Retorna true si fue posible actualizarla, en caso contrario retorna false.
     * @param taskAbility
     * @return boolean
     */
    @Override
    public boolean editTaskAbility(TaskAbility taskAbility){
        try(Connection conn = sql2o.open()){
            conn.createQuery("UPDATE \"Task_ability\" SET id_task = :id_task, id_eme_ability = :id_eme_ability WHERE id_task_ability = :id_task_ability")
                    .addParameter("id_task_ability", taskAbility.getId_task_ability())
                    .addParameter("id_task", taskAbility.getId_task())
                    .addParameter("id_eme_ability", taskAbility.getId_eme_ability())
                    .executeUpdate();
            return true;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    /** 
     * Método que recibe un id para que, mediante este, se pueda eliminar una tabla de TaskAbility en especifico.
     * Si la tabla existe, la elimina y retorna true, de lo contrario retorna false.
     * @param id
     * @return boolean
     */
    @Override
    public boolean deleteTaskAbility(int id){
        int deletedTaskAbility;
        try(Connection conn = sql2o.open()){
            deletedTaskAbility = conn.createQuery("DELETE FROM \"Task_ability\" WHERE id_task_ability = :id")
                    .addParameter("id", id)
                    .executeUpdate().getResult();
        }
        return deletedTaskAbility == 1;
    }
}
