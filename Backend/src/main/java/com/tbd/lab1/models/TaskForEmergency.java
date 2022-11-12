package com.tbd.lab1.models;

public class TaskForEmergency {
    private Integer id_task_for_emergency;
    private Integer id_emergency;
    private String emergency_details;
    private Integer id_task;
    private String name_task;
    private Integer quanty;

    public Integer getId_task_for_emergency() {
        return id_task_for_emergency;
    }

    public Integer getId_emergency() {
        return id_emergency;
    }

    public String getEmergency_details() {
        return emergency_details;
    }

    public Integer getId_task() {
        return id_task;
    }

    public String getName_task() {
        return name_task;
    }

    public Integer getQuanty() {
        return quanty;
    }

    public void setId_task_for_emergency(Integer id_task_for_emergency) {
        this.id_task_for_emergency = id_task_for_emergency;
    }

    public void setId_emergency(Integer id_emergency) {
        this.id_emergency = id_emergency;
    }

    public void setEmergency_details(String emergency_details) {
        this.emergency_details = emergency_details;
    }

    public void setId_task(Integer id_task) {
        this.id_task = id_task;
    }

    public void setName_task(String name_task) {
        this.name_task = name_task;
    }

    public void setQuanty(Integer quanty) {
        this.quanty = quanty;
    }

    @Override
    public String toString() {
        return "TaskForEmergency{" +
                "id_task_for_emergency=" + id_task_for_emergency +
                ", id_emergency=" + id_emergency +
                ", emergency_details='" + emergency_details + '\'' +
                ", id_task=" + id_task +
                ", name_task='" + name_task + '\'' +
                ", quanty=" + quanty +
                '}';
    }
}
