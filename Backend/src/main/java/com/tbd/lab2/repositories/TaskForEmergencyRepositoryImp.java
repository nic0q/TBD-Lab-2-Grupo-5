package com.tbd.lab2.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.tbd.lab2.models.TaskForEmergency;

import java.util.List;

@Repository
public class TaskForEmergencyRepositoryImp implements TaskForEmergencyRepository {
    @Autowired
    private Sql2o sql2o;
    /**
     * Método que obtiene todas tareas de cada emergencia con el numero de volunarios asignados
     * @param null
     * @return List<TaskForEmergency>
     */
    @Override
    public List<TaskForEmergency> getTaskVoluntary(){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT id_emergency,id_task,name_task,quantity "+
            "FROM "+
                "(SELECT em.id_emergency,tk.id_task, tk.name AS name_task, COUNT(tk.id_task) AS quantity "+
                "FROM \"Emergency\" AS em "+
                "INNER JOIN \"Task\" AS tk ON tk.id_emergency = em.id_emergency "+
                "INNER JOIN \"Ranking\" AS rk ON rk.id_task = tk.id_task "+
                "WHERE rk.id_task = tk.id_task "+
                "GROUP BY(em.id_emergency, em.name, tk.id_task, name_task) "+
                "ORDER BY (em.id_emergency)) AS tablee "+
            "ORDER BY(quantity);")
            .executeAndFetch(TaskForEmergency.class);                    
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
