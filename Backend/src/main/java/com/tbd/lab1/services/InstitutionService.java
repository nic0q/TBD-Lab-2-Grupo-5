package com.tbd.lab1.services;
import com.tbd.lab1.models.Institution;
import com.tbd.lab1.repositories.InstitutionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Clase servicio para Institution.
 */
@CrossOrigin
@RestController
public class InstitutionService {
    private final InstitutionRepository institutionRepository;
    InstitutionService(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    
    /** 
     * Método que conecta la ruta /institutions con el método getAllInstitutions().
     * @return List<Institution>
     */
    @GetMapping("/institutions")
    public List<Institution> getAllInstitutions(){
        return institutionRepository.getAllInstitutions();
    }

    
    /** 
     * Método que conecta la ruta /institutions/{id} con el método getInstitutionById().
     * @param id
     * @return List<Institution>
     */
    @GetMapping("institutions/{id}")
    public List<Institution> getInstitutionById(@PathVariable("id") int id){
        return institutionRepository.getInstitutionById(id);
    }

    
    /** 
     * Método que conecta la ruta /institutions con el método createInstitution().
     * @param institution
     * @return Institution
     */
    @PostMapping("/institutions")
    public Institution createInstitution(@RequestBody Institution institution){
        return institutionRepository.createInstitution(institution);
    }

    
    /** 
     * Método que conecta la ruta /institutions con el método updateInstitution().
     * @param id
     * @param institution
     * @return String
     */
    @PutMapping("/institutions/{id}")
    public String editInstitution(@PathVariable("id") int id, @RequestBody Institution institution){
        institution.setId_institution(id);
        boolean result = institutionRepository.editInstitution(institution);
        if(result){
            return "Institución editada";
        }else {
            return "Institución no encontrada";
        }
    }
    
    /** 
     * Método que conecta la ruta /institutions/{id} con el método deleteInstitution().
     * @param id
     * @return String
     */
    @DeleteMapping("/institutions/{id}")
    public String deleteInstitution(@PathVariable("id") int id) {
        boolean result = institutionRepository.deleteInstitution(id);
        if (result) {
            return "Institución eliminada";
        } else {
            return "Institución no encontrada";
        }
    }
    
    /** 
     * Método que conecta la ruta /institutions con el método deleteAllInstitutions del
     * repositorio de Institution. Retorna un String indicando si se eliminaron todas las
     * instituciones.
     * @return String
     */
    @DeleteMapping("/institutions")
    public String deleteAllInstitution(){
        int result = institutionRepository.deleteAllInstitution();
        if(result == 1){
            return "Todas las instituciones han sido eliminadas";
        }else{
            return "Ha ocurrido un problema al intentar eliminar todas las instituciones";
        }
    }
}
