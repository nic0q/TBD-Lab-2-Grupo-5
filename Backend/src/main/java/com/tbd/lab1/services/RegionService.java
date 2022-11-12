package com.tbd.lab1.services;

import com.tbd.lab1.models.Region;
import com.tbd.lab1.repositories.RegionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Clase servicio para Region.
 */
@CrossOrigin
@RestController
public class RegionService {
    private final RegionRepository regionRepository;

    RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    /**
     * Método que conecta la ruta /regions con el método getAllRegions() del
     * repositorio de Region. Retorna una lista de todas las regiones.
     *
     * @return List<Region>
     */
    @GetMapping("/regions")
    public List<Region> getAllRegions() {
        return regionRepository.getAllRegions();
    }

    /**
     * Método que conecta la ruta /regions/{id} con el método getRegionById() del
     * repositorio de Region. Retorna una lista con la region que tiene el id
     * especificado. Si no existe una region con ese id retorna null.
     *
     * @param gid
     * @return List<Region>
     */
    @GetMapping("/regions/{gid}")
    public List<Region> getRegionById(@PathVariable("gid") int gid) {
        return regionRepository.getRegionById(gid);
    }

    /**
     * Método que conecta la ruta /regions con el método createRegion() del
     * repositorio de Region. Recibe un objeto de tipo Region y lo inserta en la
     * base de datos. Retorna el objeto de tipo Region que se insertó. Si no se pudo
     * insertar retorna null.
     *
     * @param region
     * @return Region
     */
    @PostMapping("/regions")
    @ResponseBody
    public Region createRegion(@RequestBody Region region) {
        Region result = regionRepository.createRegion(region);
        return result;
    }

    /**
     * Método que conecta la ruta /regions/{id} con el método editRegion() del
     * repositorio de Region. Recibe un objeto de tipo Region y lo actualiza en la
     * base de datos. Retorna el objeto de tipo Region que se actualizó. Si no se pudo
     * actualizar retorna null.
     * @param gid
     * @param region
     * @return Region
     */
    @PutMapping("/regions/{gid}")
    public Region editRegion(@PathVariable("gid") int gid, @RequestBody Region region) {
        region.setGid(gid);
        boolean result = regionRepository.editRegion(region);
        if (result) {
            return region;
        } else {
            return null;
        }
    }

    /**
     * Método que conecta la ruta /regions/{id} con el método deleteRegion() del
     * repositorio de Region. Recibe un objeto de tipo Region y lo elimina de la
     * base de datos. Retorna el objeto de tipo Region que se eliminó. Si no se pudo
     * eliminar retorna null.
     * @param gid
     * @return Region
     */
    @DeleteMapping("/regions/{gid}")
    public Region deleteRegion(@PathVariable("gid") int gid) {
        Region region = regionRepository.getRegionById(gid).get(0);
        boolean result = regionRepository.deleteRegion(gid);
        if (result) {
            return region;
        } else {
            return null;
        }
    }

    /**
     * Método que conecta la ruta /regions con el método deleteAllRegions() del
     * repositorio de Region. Elimina todas las regiones de la base de datos.
     * Retorna un entero que indica si se pudo eliminar o no.
     * @return int
     */
    @DeleteMapping("/regions")
    public int deleteAllRegions() {
        return regionRepository.deleteAllRegion();
    }
}
