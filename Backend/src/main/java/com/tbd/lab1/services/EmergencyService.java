package com.tbd.lab1.services;

import com.tbd.lab1.models.Emergency;
import com.tbd.lab1.repositories.EmergencyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Clase servicio para Emergency.
 */
@CrossOrigin
@RestController
public class EmergencyService {

    private final EmergencyRepository emergencyRepository;
    EmergencyService(EmergencyRepository emergencyRepository) {
        this.emergencyRepository = emergencyRepository;
    }

    /** 
     * Método que conecta la ruta /emergencies con el método getAllEmergencies() del
     * repositorio de Emergency. Retorna una lista de todas las emergencias.
     * @return List<Emergency>
     */
    @GetMapping("/emergencies")
    public List<Emergency> getAllEmergencies(){
        return emergencyRepository.getAllEmergencies();
    }

    /** 
     * Método que conecta la ruta /emergencies/{id} con el método getEmergencyById() del
     * repositorio de Emergency. Retorna una lista con la emergencia que tiene el id
     * especificado. Si no existe una emergencia con ese id retorna null.
     * @param id
     * @return List<Emergency>
     */
    @GetMapping("emergencies/{id}")
    public List<Emergency> getEmergencyById(@PathVariable("id") int id){
        return emergencyRepository.getEmergencyById(id);
    }

    /** 
     * Método que conecta la ruta /emergencies con el método createEmergency() del
     * repositorio de Emergency. Recibe un objeto de tipo Emergency y lo inserta en la
     * base de datos. Retorna el objeto de tipo Emergency que se insertó. Si no se pudo
     * insertar retorna null.
     * @param emergency
     * @return Emergency
     */
    @PostMapping("/emergencies")
    @ResponseBody
    public Emergency createEmergency(@RequestBody Emergency emergency){
        Emergency result = emergencyRepository.createEmergency(emergency);
        return result;
    }

    /** 
     * Método que conecta la ruta /emergencies/{id} con el método editEmergency() del
     * repositorio de Emergency. Recibe un objeto de tipo Emergency y lo actualiza en la
     * base de datos. Retorna un mensaje de éxito si se pudo actualizar, de lo contrario retorna 
     * un mensaje indicando que no se pudo encontrar la emergencia.
     * @param id
     * @param emergency
     * @return String
     */
    @PutMapping("/emergencies/{id}")
    public String editEmergency(@PathVariable("id") int id, @RequestBody Emergency emergency){
        emergency.setId_emergency(id);
        boolean result = emergencyRepository.editEmergency(emergency);
        if(result){
            return "Emergencia editada";
        }else {
            return "Emergencia no encontrada";
        }
    }

    /** 
     * Método que conecta la ruta /emergencies/{id} con el método deleteEmergency() del
     * repositorio de Emergency. Recibe un id y elimina la emergencia que tiene ese id.
     * Retorna un mensaje de éxito si se pudo eliminar, de lo contrario retorna un mensaje
     * donde se indica que la emergencia no se pudo encontrar.
     * @param id
     * @return String
     */
    @DeleteMapping("/emergencies/{id}")
    public String deleteEmergency(@PathVariable("id") int id){
        boolean result = emergencyRepository.deleteEmergency(id);
        if(result){
            return "Emergencia eliminada";
        }else{
            return "Emergencia no encontrada";
        }
    }

    /** 
     * Método que conecta la ruta /emergencies con el método deleteAllEmergency() del
     * repositorio de Emergency. Elimina todas las emergencias de la base de datos.
     * Retorna un mensaje de éxito si se pudo eliminar, de lo contrario retorna un mensaje
     * donde se indica que no se pudo eliminar.
     * @return String
     */
    @DeleteMapping("/emergencies")
    public String deleteAllEmergencies(){
        int result = emergencyRepository.deleteAllEmergency();
        if(result == 1){
            return "Todas las emergencias han sido eliminadas";
        }else{
            return "Hubo un error eliminando emergencias";
        }
    }


    @GetMapping("/emergencies/region/{id}")
    public List<Emergency> getEmergenciesByRegion(@PathVariable("id") Integer id){
        return emergencyRepository.obtieneEmergenciasPorRegion(id);
    }
}
