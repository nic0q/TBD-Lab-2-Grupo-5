package com.tbd.lab1.repositories;

import com.tbd.lab1.models.Institution;

import java.util.List;

/**
 * Interface para InstitutionRepository.
 */
public interface InstitutionRepository {
    public List<Institution> getAllInstitutions();

    public List<Institution> getInstitutionById(int id);

    public Institution createInstitution(Institution institution);

    public boolean editInstitution(Institution institution);

    public boolean deleteInstitution(int id);

    public int deleteAllInstitution();
}
