package com.tbd.lab1.services;

import com.tbd.lab1.models.Voluntary;
import com.tbd.lab1.repositories.VoluntaryRepository;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

/**
 * Clase servicio para Voluntary.
 */
@CrossOrigin
@RestController
public class VoluntaryService {

    private final VoluntaryRepository voluntaryRepository;
    VoluntaryService(VoluntaryRepository voluntaryRepository){
        this.voluntaryRepository = voluntaryRepository;
    }

    
    /** 
     * Método que conecta la ruta /voluntaries con el método getAllVoluntaries() del
     * repositorio de Voluntary. Retorna una lista de todos los voluntarios.
     * @return List<Voluntary>
     */
    @GetMapping("/voluntaries")
    public List<Voluntary> getAllVoluntaries() {
        return voluntaryRepository.getAllVoluntaries();
    }
    
    /** 
     * Método que conecta la ruta /voluntaries/{rut} con el método getVoluntaryByRut() del
     * repositorio de Voluntary. Retorna una lista con el voluntario que tiene el rut
     * especificado. Si no existe un voluntario con ese rut retorna null.
     * @param rut
     * @return List<Voluntary>
     */
    @GetMapping("/voluntaries/{rut}")
    public List<Voluntary> getVoluntaryById(@PathVariable("rut") String rut) {
        return voluntaryRepository.getVoluntaryByRut(rut);
    }
    
    /** 
     * Método que conecta la ruta /voluntaries/count con el método countVoluntaries() del
     * repositorio de Voluntary. Retorna un entero con la cantidad de voluntarios.
     * @return String
     */
    @GetMapping("/voluntaries/count")
    public String countVoluntary(){
        int total = voluntaryRepository.countVoluntary();
        return String.format("Tienes %s Voluntarios", total);
    }

    
    /** 
     * Método que conecta la ruta /voluntaries con el método createVoluntary() del
     * repositorio de Voluntary. Recibe un objeto de tipo Voluntary y lo inserta en la
     * base de datos. Retorna el objeto de tipo Voluntary que se insertó. Si no se pudo
     * insertar retorna null.
     * @param voluntary
     * @return Voluntary
     */
    @PostMapping("/voluntaries")
    @ResponseBody
    public Voluntary createVoluntary(@RequestBody Voluntary voluntary){
        Voluntary result = voluntaryRepository.createVoluntary(voluntary);
        return result;
    }

    
    /** 
     * Método que conecta la ruta /voluntaries con el método editVoluntary() del
     * repositorio de Voluntary. Recibe un objeto de tipo Voluntary y lo edita en la
     * base de datos. Retorna el objeto de tipo Voluntary que se editó. Si no se pudo
     * editar retorna null.
     * @param rut
     * @param voluntary
     * @return String
     */
    @PutMapping("/voluntaries/{rut}")
    @ResponseBody
    public String editVoluntary(@PathVariable("rut") String rut, @RequestBody Voluntary voluntary){
        voluntary.setRut(rut);
        boolean result = voluntaryRepository.editVoluntary(voluntary);
        if (result){
            return "Voluntario editado";
        }else{
            return "Voluntario no encontrado";
        }
    }
    
    /** 
     * Método que conecta la ruta /voluntaries/rut con el método deleteVoluntary() del
     * repositorio de Voluntary. Recibe un rut y elimina el voluntario con ese rut de la
     * base de datos. Retorna un string con el resultado de la operación.
     * @param rut
     * @return String
     */
    @DeleteMapping("/voluntaries/{rut}")
    @ResponseBody
    public String deleteVoluntary(@PathVariable("rut") String rut){
        boolean result = voluntaryRepository.deleteVoluntary(rut);
        if (result){
            return "Voluntario eliminado";
        }else{
            return "Voluntario no encontrado";
        }
    }

    /**
     * Método que conecta la ruta /voluntaries con el método deleteAllVoluntary() del
     * repositorio de Voluntary. Elimina todos los voluntarios de la
     * base de datos. Retorna un string con el resultado de la operación.
     * @return String
     */
    @DeleteMapping("/voluntaries")
    @ResponseBody
    public String deleteAllVoluntary(){
        int result = voluntaryRepository.deleteAllVoluntary();
        if (result == 1){
            return "Voluntarios eliminados";
        }else{
            return "Voluntarios no encontrados";
        }
    }
}
