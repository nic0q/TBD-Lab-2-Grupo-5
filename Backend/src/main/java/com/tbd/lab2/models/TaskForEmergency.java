package com.tbd.lab2.models;

public class TaskForEmergency {
    private Integer id_emergency;
    private String emergency_details;
    private Integer id_task;
    private String name_task;
    private Integer quantity;

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

    public Integer getQuantity() {
        return quantity;
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

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "TaskForEmergency{" +
                ", id_emergency=" + id_emergency +
                ", emergency_details='" + emergency_details + '\'' +
                ", id_task=" + id_task +
                ", name_task='" + name_task + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
