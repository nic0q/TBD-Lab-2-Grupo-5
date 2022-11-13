package com.tbd.lab2.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.tbd.lab2.models.StateTask;

import java.util.List;

/**
 * Clase que implementa la interfaz StateTaskRepository
 */
@Repository
public class StateTaskRepositoryImp implements StateTaskRepository{
    @Autowired
    private Sql2o sql2o;
    /**
     * Método que retorna una lista de todas las tablas de StateTask
     * @return List<StateTask>
     */
    @Override
    public List<StateTask> getAllStateTask() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"State_task\"").
                    executeAndFetch(StateTask.class);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Metodo que retorna un objeto de tipo StateTask, dado un id
     * @return List<StateTask>
     */
    @Override
    public List<StateTask> getStateTaskById(Integer id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM \"State_task\" WHERE id_state_task = :idStateTask")
                    .addParameter("idStateTask", id)
                    .executeAndFetch(StateTask.class);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Método que recibe un objeto de tipo StateTask y lo inserta en la base de datos.
     * si no se pudo insertar retorna null.
     * @param stateTask
     * @return StateTask
     */
    @Override
    public StateTask createStateTask(StateTask stateTask) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("INSERT INTO \"State_task\" (state) VALUES (:stateTask)")
                    .addParameter("stateTask", stateTask.getState())
                    .executeUpdate().getKey();
            return stateTask;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Método que recibe un objeto de tipo StateTask y lo actualiza en la base de datos mediante su id.
     * si no se pudo actualizar retorna null.
     * @param stateTask
     * @return StateTask
     */
    @Override
    public boolean editStateTask(StateTask stateTask) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("UPDATE \"State_task\" set state = :stateTask WHERE id_state_task = :idStateTask")
                    .addParameter("stateTask", stateTask.getState())
                    .addParameter("idStateTask", stateTask.getId_state_task())
                    .executeUpdate().getKey();
            return true;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * Método que recibe un id de tipo Integer y elimina un objeto de tipo StateTask de la base de datos.
     * si no se pudo eliminar retorna null.
     * @param id
     * @return StateTask
     */
    @Override
    public boolean deleteStateTask(Integer id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE FROM \"State_task\" WHERE id_state_task = :idStateTask")
                    .addParameter("idStateTask", id)
                    .executeUpdate().getKey();
            return true;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * Método elimina todas las StateTask de la base de datos.
     * @return boolean
     */
    @Override
    public boolean deleteAllStateTask(){
        try(Connection conn = sql2o.open()){
            conn.createQuery("TRUNCATE \"State_task\" CASCADE")
                    .executeUpdate();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
