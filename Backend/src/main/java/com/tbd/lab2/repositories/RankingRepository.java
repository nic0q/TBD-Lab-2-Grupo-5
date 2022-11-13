package com.tbd.lab2.repositories;

import java.util.List;

import com.tbd.lab2.models.Ranking;

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
