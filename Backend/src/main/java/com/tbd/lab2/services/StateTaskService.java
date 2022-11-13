package com.tbd.lab2.services;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tbd.lab2.models.StateTask;
import com.tbd.lab2.repositories.StateTaskRepository;

/**
 * Servicio para el estado de una tarea
 */
@CrossOrigin
@RestController
public class StateTaskService {
    private final StateTaskRepository stateTaskRepository;

    public StateTaskService(StateTaskRepository stateTaskRepository) {
        this.stateTaskRepository = stateTaskRepository;
    }

    /** 
     * Método que conecta la ruta /states con el método getAllStates() del
     * repositorio de StateTask.
     * retorna una lista con todos los objetos de tipo StateTask.
     * @return List<StateTask>
     */
    @GetMapping("/stateTasks")
    public List<StateTask> getAllStateTasks(){
        return stateTaskRepository.getAllStateTask();
    }

    /** 
     * Método que conecta la ruta /states/{id} con el método getStateById() del
     * repositorio de StateTask.
     * retorna una lista con todos los objetos de tipo StateTask que tengan el id
     * ingresado por parámetro.
     * @param id
     * @return List<StateTask>
     */
    @GetMapping("stateTasks/{id}")
    public List<StateTask> getStateTaskById(@PathVariable("id") Integer id){
        return stateTaskRepository.getStateTaskById(id);
    }

    /** 
     * Método que conecta la ruta /states con el método createState() del
     * repositorio de StateTask.
     * retorna el objeto de tipo StateTask que se insertó. Si no se pudo insertar retorna null.
     * @param stateTask
     * @return StateTask
     */
    @PostMapping("/stateTasks")
    @ResponseBody
    public StateTask createStateTask(@RequestBody StateTask stateTask){
        StateTask result = stateTaskRepository.createStateTask(stateTask);
        return result;
    }

    /** 
     * Método que conecta la ruta /states/{id} con el método editState() del
     * repositorio de StateTask.
     * retorna el objeto de tipo StateTask que se actualizó.
     * @param id
     * @param stateTask
     * @return StateTask
     */
    @PutMapping("/stateTasks/{id}")
    public String editStateTask(@PathVariable("id") int id, @RequestBody StateTask stateTask){
        stateTask.setId_state_task(id);
        boolean result = stateTaskRepository.editStateTask(stateTask);
        if(result) return "Estado de tarea editado";
        else return "Error al editar el estado de la tarea";
    }

    /** 
     * Método que conecta la ruta /states/{id} con el método deleteState() del
     * repositorio de StateTask.
     * retorna un String que indica si se pudo eliminar el objeto de tipo StateTask.
     * @param id
     * @return StateTask
     */
    @DeleteMapping("/stateTasks/{id}")
    public String deleteStateTask(@PathVariable("id") int id){
        boolean result = stateTaskRepository.deleteStateTask(id);
        if(result) return "Estado de tarea eliminado";
        else return "Error al eliminar el estado de la tarea";
    }

    /** 
     * Método que conecta la ruta /abilities con el método deleteAllAbility() del
     * repositorio de StateTask.
     * retorna un String indicando si se pudo eliminar todas las habilidades.
     * @return String
     */
    @DeleteMapping("/stateTasks")
    public String deleteAllStateTask(){
        boolean result = stateTaskRepository.deleteAllStateTask();
        if(result) return "Todas Las StateTasks eliminadas";
        else return "Error al eliminar todas las StateTasks";
    }
}
