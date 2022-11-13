package com.tbd.lab2.services;
import org.springframework.web.bind.annotation.*;

import com.tbd.lab2.models.VolAbility;
import com.tbd.lab2.repositories.VolAbilityRepository;

import java.util.List;


/**
 * Clase servicio para VolAbility.
 */
@CrossOrigin
@RestController
public class VolAbilityService {
    
    private final VolAbilityRepository volAbilityRepository;
    VolAbilityService(VolAbilityRepository volAbilityRepository) {
        this.volAbilityRepository = volAbilityRepository;
    }

    
    /** 
     * Método que conecta la ruta /vol-abilities con el método getAllVolAbilities()
     * @return List<VolAbility>
     */
    @GetMapping("/vol-abilities")
    public List<VolAbility> getAllVolAbilities(){
        return volAbilityRepository.getAllVolAbilities();
    }

    
    /** 
     * Método que conecta la ruta /vol-abilities/{id} con el método getVolAbilityById()
     * @param id
     * @return List<VolAbility>
     */
    @GetMapping("/vol-abilities/{id}")
    public List<VolAbility> getVolAbilityById(@PathVariable("id") int id){
        return volAbilityRepository.getVolAbilityById(id);
    }

    
    /** 
     * Método que conecta la ruta /vol-abilities con el método createVolAbility()
     * @param volAbility
     * @return VolAbility
     */
    @PostMapping("/vol-abilities")
    public VolAbility createVolAbility(@RequestBody VolAbility volAbility){
        return volAbilityRepository.createVolAbility(volAbility);
    }

    
    /** 
     * Método que conecta la ruta /vol-abilities con el método updateVolAbility()
     * @param id
     * @param volAbility
     * @return String
     */
    @PutMapping("/vol-abilities/{id}")
    public String updateVolAbility(@PathVariable("id") int id, @RequestBody VolAbility volAbility){
        volAbility.setId_vol_ability(id);
        boolean result = volAbilityRepository.editVolAbility(volAbility);
        if(result){
            return "VolAbility actualizado correctamente";
        }
        else{
            return "VolAbility no actualizado";
        }
    }

    
    /** 
     * Método que conecta la ruta /vol-abilities con el método deleteVolAbility()
     * @param id
     * @return String
     */
    @DeleteMapping("/vol-abilities/{id}")
    public String deleteVolAbility(@PathVariable("id") int id){
        boolean result = volAbilityRepository.deleteVolAbility(id);
        if(result){
            return "VolAbility eliminado correctamente";
        }
        else{
            return "VolAbility no eliminado";
        }
    }
}
