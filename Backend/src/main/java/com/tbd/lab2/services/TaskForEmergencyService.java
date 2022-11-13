package com.tbd.lab2.services;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tbd.lab2.models.TaskForEmergency;
import com.tbd.lab2.repositories.TaskForEmergencyRepository;

import java.util.List;

@CrossOrigin
@RestController
public class TaskForEmergencyService {
    private final TaskForEmergencyRepository taskForEmergencyRepository;


    public TaskForEmergencyService(TaskForEmergencyRepository taskForEmergencyRepository) {
        this.taskForEmergencyRepository = taskForEmergencyRepository;
    }

    @GetMapping("/tasks-for-emergency")
    public List<TaskForEmergency> getTaskVoluntary(){
        return taskForEmergencyRepository.getTaskVoluntary();
    }
    @GetMapping("/tasks-for-emergency/{id}")
    public List<TaskForEmergency> getTaskVoluntaryByEmergency(@PathVariable("id") int id){
        return getTaskVoluntary().stream().filter(taskForEmergency -> taskForEmergency.getId_emergency() == id).toList();
    }
}
