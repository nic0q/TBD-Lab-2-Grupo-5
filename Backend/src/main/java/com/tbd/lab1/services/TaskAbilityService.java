package com.tbd.lab1.services;

import com.tbd.lab1.models.TaskAbility;
import com.tbd.lab1.repositories.TaskAbilityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Clase que representa el servicio de habilidades de tarea
 */
@CrossOrigin
@RestController
public class TaskAbilityService {

    private final TaskAbilityRepository taskAbilityRepository;

    TaskAbilityService(TaskAbilityRepository taskAbilityRepository){
        this.taskAbilityRepository = taskAbilityRepository;
    }

    /** 
     * Método que conecta la ruta /task-abilities con el método createTaskAbility() del
     * repositorio de TaskAbility. Retorna el objeto de tipo TaskAbility que se insertó
     * en la base de datos. Si no se pudo insertar retorna null.
     * @param taskHability
     * @return TaskAbility
     */
    @PostMapping("/tasks-abilities")
    @ResponseBody
    TaskAbility createTaskHability(@RequestBody TaskAbility taskHability){
        TaskAbility result = taskAbilityRepository.createTaskAbility(taskHability);
        return result;
    }

    /** 
     * Método que conecta la ruta /tasks-abilities con el método getAllTaskAbilities() del
     * repositorio de TaskAbility. Retorna una lista con todos los objetos de tipo TaskAbility
     * que se encuentran en la base de datos.
     * @return List<TaskAbility>
     */
    @GetMapping("/tasks-abilities")
    public List<TaskAbility> getAllTaskHabilities(){
        return taskAbilityRepository.getAllTaskAbilities();
    }

    /** 
     * Método que conecta la ruta /tasks-abilities/{id} con el método getTaskAbilityById() del
     * repositorio de TaskAbility. Retorna una lista con todos los objetos de tipo TaskAbility
     * que se encuentran en la base de datos. Si no se encuentra retorna null.
     * @param id
     * @return List<TaskAbility>
     */
    @GetMapping("/tasks-abilities/{id}")
    public List<TaskAbility> getTaskHabilityById(@PathVariable("id") int id){
        return taskAbilityRepository.getTaskAbilityById(id);
    }

    /**
     * Método que conecta la ruta /task-abilities/{id} con el método editTaskHability() del
     * repositorio de TaskAbility. Retorna el objeto de tipo TaskAbility que se actualizó. 
     * @param id
     * @param taskHability
     * @return String
     */
    @PutMapping("/tasks-abilities/{id}")
    @ResponseBody
    public String editTaskHability(@PathVariable("id") int id, @RequestBody TaskAbility taskHability){
        taskHability.setId_task_ability(id);
        boolean result = taskAbilityRepository.editTaskAbility(taskHability);
        if (result){
            return "Tarea de habilidad editada";
        }else{
            return "Tarea de habilidad no encontrada";
        }
    }

    /** 
     * Método que conecta la ruta /tasks-abilities/{id} con el método deleteTaskAbility() del
     * repositorio de TaskAbility. Retorna un String indicando si se pudo eliminar o no.
     * @param id
     * @return String
     */
    @DeleteMapping("/tasks-abilities/{id}")
    @ResponseBody
    public String deleteTaskHability(@PathVariable("id") int id){
        boolean result = taskAbilityRepository.deleteTaskAbility(id);
        if (result){
            return "Tarea de habilidad eliminada";
        }else{
            return "Tarea de habilidad no encontrada";
        }
    }
}
