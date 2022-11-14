package com.tbd.lab2.services;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tbd.lab2.models.TaskForEmergency;
import com.tbd.lab2.repositories.TaskForEmergencyRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el servicio para TaskForEmergency
 */
@CrossOrigin
@RestController
public class TaskForEmergencyService {
    private final TaskForEmergencyRepository taskForEmergencyRepository;


    public TaskForEmergencyService(TaskForEmergencyRepository taskForEmergencyRepository) {
        this.taskForEmergencyRepository = taskForEmergencyRepository;
    }

    
    /** 
     * Metodo que conecta la ruta /tasks-for-emergency con la funcion getTasksVoluntary
     * del repositorio de TaskForEmergency. Retorna una lista de todas las tareas
     * para emergencias.
     * @return List<TaskForEmergency>
     */
    @GetMapping("/tasks-for-emergency")
    public List<TaskForEmergency> getTaskVoluntary(){
        return taskForEmergencyRepository.getTaskVoluntary();
    }

    /**
     * Metodo que conecta la ruta /tasks-for-emergency/{id} con la funcion getTaskVoluntaryByEmergency
     * del repositorio de TaskForEmergency. Retorna una lista de todas las tareas para emergencias
     * que coincidan con el id de la emergencia.
     * @param id
     * @return List<TaskForEmergency>
     */
    @GetMapping("/tasks-for-emergency/{id}")
    public List<TaskForEmergency> getTaskVoluntaryByEmergency(@PathVariable("id") int id){
        List<TaskForEmergency> lista_tasks = getTaskVoluntary().stream().filter(taskForEmergency -> taskForEmergency.getId_emergency() == id).toList();
        List<TaskForEmergency> lista_tasks2 = new ArrayList<TaskForEmergency>();
        int size = (int) Math.ceil(lista_tasks.size() / 2.0), quantity = -1, contador = 0;
        while(contador < lista_tasks.size() && (quantity == lista_tasks.get(contador).getQuantity() || contador < size)){
            quantity = lista_tasks.get(contador).getQuantity();
            lista_tasks2.add(lista_tasks.get(contador));
            contador++;
        }
        return lista_tasks2;
    }
}
