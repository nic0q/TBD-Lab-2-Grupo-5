package com.tbd.lab1.repositories;

import com.tbd.lab1.models.Ranking;

import java.util.List;

/**
 * Interface para RankigRepository.
 */
public interface RankingRepository {
    
    public List<Ranking> getAllRankings();
    
    public List<Ranking> getRankingById(int id);
    
    public Ranking createRanking(Ranking ranking);
    
    public boolean editRanking(Ranking ranking);
    
    public boolean deleteRanking(int id);

    public boolean deleteAllRanking();
}
