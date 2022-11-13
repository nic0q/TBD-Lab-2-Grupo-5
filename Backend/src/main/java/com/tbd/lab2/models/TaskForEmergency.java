package com.tbd.lab2.models;

public class TaskForEmergency {
    private Integer id_emergency;
    private Integer id_task;
    private String name_task;
    private Integer quantity;

    public Integer getId_emergency() {
        return id_emergency;
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
                ", id_task=" + id_task +
                ", name_task='" + name_task + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
