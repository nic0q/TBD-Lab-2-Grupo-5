package com.tbd.lab1.services;

import com.tbd.lab1.models.TaskForEmergency;
import com.tbd.lab1.repositories.TaskForEmergencyRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class TaskForEmergencyService {
    private final TaskForEmergencyRepository taskForEmergencyRepository;


    public TaskForEmergencyService(TaskForEmergencyRepository taskForEmergencyRepository) {
        this.taskForEmergencyRepository = taskForEmergencyRepository;
    }

    @GetMapping("/tasks-for-emergency")
    public List<TaskForEmergency> obtieneTareasPorEmergencia(){
        return taskForEmergencyRepository.obtieneTareasPorEmergencia();
    }
}
