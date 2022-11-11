package com.tbd.lab1.services;
import com.tbd.lab1.models.Ranking;
import com.tbd.lab1.repositories.RankingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Clase servicio para Ranking.
 */
@CrossOrigin
@RestController
public class RankingService {
    
    private final RankingRepository rankingRepository;
    RankingService(RankingRepository rankingRepository) {
        this.rankingRepository = rankingRepository;
    }

    
    /** 
     * Método que conecta la ruta /rankings con el método getAllRankings()
     * @return List<Ranking>
     */
    @GetMapping("/rankings")
    public List<Ranking> getAllRankings(){
        return rankingRepository.getAllRankings();
    }

    
    /** 
     * Método que conecta la ruta /rankings/{id} con el método getRankingById()
     * @param id
     * @return List<Ranking>
     */
    @GetMapping("rankings/{id}")
    public List<Ranking> getRankingById(@PathVariable("id") int id){
        return rankingRepository.getRankingById(id);
    }

    
    /** 
     * Método que conecta la ruta /rankings con el método createRanking()
     * @param ranking
     * @return Ranking
     */
    @PostMapping("/rankings")
    public Ranking createRanking(@RequestBody Ranking ranking){
        return rankingRepository.createRanking(ranking);
    }

    
    /** 
     * Método que conecta la ruta /rankings con el método updateRanking()
     * @param id
     * @param ranking
     * @return String
     */
    @PutMapping("/rankings/{id}")
    public String editRanking(@PathVariable("id") int id, @RequestBody Ranking ranking){
        ranking.setId_ranking(id);
        boolean result = rankingRepository.editRanking(ranking);
        if(result){
            return "Ranking editado";
        }else {
            return "Ranking no encontrado";
        }
    }

    
    /** 
     * Método que conecta la ruta /rankings/{id} con el método deleteRanking()
     * @param id
     * @return String
     */
    @DeleteMapping("/rankings/{id}")
    public String deleteRanking(@PathVariable("id") int id) {
        boolean result = rankingRepository.deleteRanking(id);
        if (result) {
            return "Ranking eliminado";
        } else {
            return "Ranking no encontrado";
        }
    }

    /** 
     * Método que conecta la ruta /rankings con el método deleteAllRanking()
     * @return String
     */
    @DeleteMapping("/rankings")
    public String deleteAllRankings() {
        boolean result = rankingRepository.deleteAllRanking();
        if (result) {
            return "Rankings eliminados";
        } else {
            return "Rankings no encontrados";
        }
    }
}
