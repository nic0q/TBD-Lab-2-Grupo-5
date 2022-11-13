package com.tbd.lab2.services;

import org.springframework.web.bind.annotation.*;

import com.tbd.lab2.models.Ability;
import com.tbd.lab2.repositories.AbilityRepository;

import java.util.List;

/**
 * Clase que representa el servicio de habilidades
 */
@CrossOrigin
@RestController
public class AbilityService {
    private final AbilityRepository abilityRepository;

    public AbilityService(AbilityRepository abilityRepository) {
        this.abilityRepository = abilityRepository;
    }

    /** 
     * Método que conecta la ruta /abilities con el método getAllAbilities() del
     * repositorio de Ability.
     * @return List<Ability>
     */
    @GetMapping("/abilities")
    public List<Ability> getAllAbilities(){
        return abilityRepository.getAllAbilities();
    }

    /** 
     * Método que conecta la ruta /abilities/{id} con el método getAbilityById() del
     * repositorio de Ability.
     * @param id
     * @return List<Ability>
     */
    @GetMapping("abilities/{id}")
    public List<Ability> getAbilityById(@PathVariable("id") Integer id){
        return abilityRepository.getAbilityById(id);
    }

    /** 
     * Método que conecta la ruta /abilities con el método createAbility() del
     * repositorio de Ability.
     * retorna el objeto de tipo Ability que se insertó. Si no se pudo insertar retorna null.
     * @param ability
     * @return Ability
     */
    @PostMapping("/abilities")
    @ResponseBody
    public Ability createAbility(@RequestBody Ability ability){
        Ability result = abilityRepository.createAbility(ability);
        return result;
    }

    /** 
     * Método que conecta la ruta /abilities/{id} con el método editAbility() del
     * repositorio de Ability.
     * retorna el objeto de tipo Ability que se actualizó.
     * @param id
     * @param ability
     * @return Ability
     */
    @PutMapping("/abilities/{id}")
    public String editAbility(@PathVariable("id") int id, @RequestBody Ability ability){
        ability.setId_ability(id);
        boolean result = abilityRepository.editAbility(ability);
        if(result) return "Habilidad editada";
        else return "Error al editar la habilidad";
    }

    /** 
     * Método que conecta la ruta /abilities/{id} con el método deleteAbility() del
     * repositorio de Ability.
     * reotrna un String indicando si se pudo eliminar la habilidad.
     * @param id
     * @return String
     */
    @DeleteMapping("/abilities/{id}")
    public String deleteAbility(@PathVariable("id") int id){
        boolean result = abilityRepository.deleteAbility(id);
        if(result) return "Habilidad eliminada";
        else return "Error al eliminar la habilidad";
    }

    /** 
     * Método que conecta la ruta /abilities con el método deleteAllAbility() del
     * repositorio de Ability.
     * retorna un String indicando si se pudo eliminar todas las habilidades.
     * @return String
     */
    @DeleteMapping("/abilities")
    public String deleteAllAbility(){
        int result = abilityRepository.deleteAllAbility();
        if(result == 1){
            return "Todas las habilidades han sido eliminadas";
        }
        else{
            return "Ha habido un error al intentar borrar todas las habilidades";
        }
    }
}
