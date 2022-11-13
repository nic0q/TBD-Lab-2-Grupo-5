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

    @Override
    public List<TaskForEmergency> getTaskVoluntary(){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT em.id_emergency, em.emergency_details, tk.id_task, tk.name AS name_task, COUNT(tk.id_task) AS quantity FROM \"Emergency\" AS em INNER JOIN \"Task\" AS tk ON tk.id_emergency = em.id_emergency INNER JOIN \"Ranking\" AS rk ON rk.id_task = tk.id_task WHERE rk.id_task = tk.id_task GROUP BY(em.id_emergency, em.emergency_details, tk.id_task, name_task) ORDER BY (em.id_emergency)")
                    .executeAndFetch(TaskForEmergency.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<TaskForEmergency> getTaskVoluntaryByEmergency(int id_emergency){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT Emer_Task.id_emergency, Emer_Task.emergency_details, Emer_Task.id_task, Emer_Task.name_task, Emer_Task.quantity FROM ( SELECT em.id_emergency, em.emergency_details, tk.id_task, tk.name AS name_task, COUNT(tk.id_task) AS quantity FROM \"Emergency\" AS em INNER JOIN \"Task\" AS tk ON tk.id_emergency = em.id_emergency INNER JOIN \"Ranking\" AS rk ON rk.id_task = tk.id_task WHERE rk.id_task = tk.id_task GROUP BY(em.id_emergency, em.emergency_details, tk.id_task, name_task) ORDER BY (em.id_emergency)) AS Emer_Task WHERE Emer_Task.id_emergency = :id_emergency ORDER BY Emer_Task.quantity DESC;")
                    .addParameter("id_emergency", id_emergency)
                    .executeAndFetch(TaskForEmergency.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
