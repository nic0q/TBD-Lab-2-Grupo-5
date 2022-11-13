package com.tbd.lab2.services;

import org.springframework.web.bind.annotation.*;

import com.tbd.lab2.models.Task;
import com.tbd.lab2.repositories.TaskRepository;

import java.util.List;

/**
 * Clase que representa el servicio de tareas
 */
@CrossOrigin
@RestController
public class TaskService {
    private final TaskRepository taskRepository;
    TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    /** 
     * Método que conecta la ruta /tasks con el método getAllTasks() del
     * repositorio de Task. Retorna una lista de tareas.
     * @return List<Task>
     */
    @GetMapping("/tasks")
    public List<Task> getAllVoluntaries() {
        return taskRepository.getAllTasks();
    }

    
    /** 
     * Método que conecta la ruta /tasks/{id} con el método getTaskById() del
     * repositorio de Task. Retorna una tarea por id. Si no se encuentra retorna
     * null.
     * @param id
     * @return List<Task>
     */
    @GetMapping("/tasks/{id}")
    public List<Task> getTaskById(@PathVariable("id") int id) {
        return taskRepository.getTaskById(id);
    }
    
    /** 
     * Método que conecta la ruta /task/count con el método countTask del
     * repositorio.  Cuenta la cantidad de tareas que hay en la base de datos.
     * @return String
     */
    @GetMapping("/tasks/count")
    public String countTask(){
        int total = taskRepository.countTask();
        return String.format("Tienes %s tareas", total);
    }

    /** 
     * Método que conecta la ruta /tasks con el método createTask() del
     * repositorio de Task. Retorna el objeto de tipo Task que se insertó
     * en la base de datos. Si no se pudo insertar retorna null.
     * @param task
     * @return Task
     */
    @PostMapping("/tasks")
    @ResponseBody
    public Task createTask(@RequestBody Task task){
        Task result = taskRepository.createTask(task);
        return result;
    }

    
    /** 
     * Método que conecta la ruta /tasks/{id} con el método editTask() del
     * repositorio de Task. Retorna el objeto de tipo Task que se editó
     * en la base de datos. Si no se pudo editar retorna null.
     * @param id
     * @param task
     * @return String
     */
    @PutMapping("/task/{id}")
    @ResponseBody
    public String editTask(@PathVariable("id") int id, @RequestBody Task task){
        task.setId(id);
        boolean result = taskRepository.editTask(task);
        if (result){
            return "Tarea editada";
        }else{
            return "Tarea no encontrada";
        }
    }
    
    /** 
     * Método que conecta la ruta /tasks/{id} con el método deleteTask() del
     * repositorio de Task. Retorna un mensaje indicando si el objeto de tipo 
     * Task se eliminó de la base de datos.
     * @param id
     * @return String
     */
    @DeleteMapping("/task/{id}")
    @ResponseBody
    public String deleteTask(@PathVariable("id") int id){
        boolean result = taskRepository.deleteTask(id);
        if (result){
            return "Tarea eliminada";
        }else{
            return "Tarea no encontrada";
        }
    }

    
    /** 
     * Método que conecta la ruta /tasks con el método deleteAllTasks() del
     * repositorio de Task. Retorna un mensaje indicando si los objetos de tipo
     * Task se eliminaron de la base de datos.
     * @return String
     */
    @DeleteMapping("/tasks")
    @ResponseBody
    public String deleteAllTask(){
        int result = taskRepository.deleteAllTask();
        if (result == 1){
            return "Todas las tareas han sido eliminadas";
        }else{
            return "Ha habido un error al intentar borrar todas las tareas";
        }
    }
}
