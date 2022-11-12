package com.tbd.lab1.repositories;

import com.tbd.lab1.models.TaskForEmergency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class TaskForEmergencyRepositoryImp implements TaskForEmergencyRepository {
    @Autowired
    private Sql2o sql2o;
    @Override
    public List<TaskForEmergency> obtieneTareasPorEmergencia(){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT em.id_emergency, em.emergency_details, tk.id_task, tk.name, COUNT(tk.id_task) AS quanty FROM \"Emergency\" AS em INNER JOIN \"Task\" AS tk ON tk.id_emergency = em.id_emergency INNER JOIN \"Ranking\" AS rk ON rk.id_task = tk.id_task WHERE rk.id_task = tk.id_task GROUP BY(em.id_emergency, em.emergency_details, tk.id_task, tk.name) ORDER BY (em.id_emergency)")
                    .executeAndFetch(TaskForEmergency.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
