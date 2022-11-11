package com.tbd.lab1.services;

import com.tbd.lab1.models.EmeAbility;
import com.tbd.lab1.repositories.EmeAbilityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Clase que representa el servicio de habilidades de emergencia
 */
@CrossOrigin
@RestController
public class EmeAbilityService {

    private final EmeAbilityRepository emeAbilityRepository;
    EmeAbilityService(EmeAbilityRepository emeAbilityRepository){
        this.emeAbilityRepository = emeAbilityRepository;
    }
    
    /** 
     * Método que conecta la ruta /eme-abilities con el método createEmeAbility
     * del repositorio de habilidades de emergencia. Este método recibe un objeto
     * EmeAbility en formato JSON y lo envía al repositorio para crear una habilidad
     * de emergencia.
     * @param emeAbility
     * @return EmeAbility
     */
    @PostMapping("/eme-abilities")
    @ResponseBody
    EmeAbility createEmeAbility(@RequestBody EmeAbility emeAbility){
        EmeAbility result = emeAbilityRepository.createEmeAbility(emeAbility);
        return result;
    }
    
    /** 
     * Método que conecta la ruta /eme-abilities con el método getAllEmeAbilities
     * del repositorio de habilidades de emergencia. Este método envía una solicitud
     * al repositorio para obtener todas las habilidades de emergencia.
     * @return List<EmeAbility>
     */
    @GetMapping("/eme-abilities")
    public List<EmeAbility> getAllEmeAbilities(){
        return emeAbilityRepository.getAllEmeAbilities();
    }
    
    /** 
     * Método que conecta la ruta /eme-abilities/{id} con el método getEmeAbilityById
     * del repositorio de habilidades de emergencia. Este método envía una solicitud
     * al repositorio para obtener una habilidad de emergencia por id.
     * @param id
     * @return List<EmeAbility>
     */
    @GetMapping("/eme-abilities/{id}")
    public List<EmeAbility> getEmeAbilityById(@PathVariable("id") int id){
        return emeAbilityRepository.getEmeAbilityById(id);
    }
    
    /** 
     * Método que conecta la ruta /eme-abilities/{id} con el método editEmeAbility
     * del repositorio de habilidades de emergencia. Este método envía una solicitud
     * al repositorio para editar una habilidad de emergencia por id.
     * @param id
     * @param emeAbility
     * @return String
     */
    @PutMapping("/eme-abilities/{id}")
    @ResponseBody
    public String editEmeAbility(@PathVariable("id") int id, @RequestBody EmeAbility emeAbility){
        emeAbility.setId_eme_ability(id);
        boolean result = emeAbilityRepository.editEmeAbility(emeAbility);
        if (result){
            return "Habilidad de emergencia editada";
        }else{
            return "Habilidad de emergencia no encontrada";
        }
    }
    
    /** 
     * Método que conecta la ruta /eme-abilities/{id} con el método deleteEmeAbility
     * del repositorio de habilidades de emergencia. Este método envía una solicitud
     * al repositorio para eliminar una habilidad de emergencia por id.
     * @param id
     * @return String
     */
    @DeleteMapping("/eme-abilities/{id}")
    @ResponseBody
    public String deleteEmeHability(@PathVariable("id") int id){
        boolean result = emeAbilityRepository.deleteEmeAbility(id);
        if (result){
            return "Habilidad de emergencia eliminada";
        }else{
            return "Habilidad de emergencia no encontrada";
        }
    }
    
    /** 
     * Método que conecta la ruta /eme-abilities con el método deleteAllEmeAbility
     * del repositorio de habilidades de emergencia. Este método envía una solicitud
     * al repositorio para eliminar todas las habilidades de emergencia.
     * @return String
     */
    @DeleteMapping("/eme-abilities")
    public String deleteAllEmeHability(){
        int result = emeAbilityRepository.deleteAllEmeAbility();
        if(result == 1){
            return "Todas las habilidades de emergencia han sido eliminadas";
        }else{
            return "Ha ocurrido un error al intentar borrar las habilidades de emergencia";
        }
    }
}
