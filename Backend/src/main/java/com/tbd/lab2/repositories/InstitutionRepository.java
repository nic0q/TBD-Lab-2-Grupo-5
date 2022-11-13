package com.tbd.lab2.repositories;

import java.util.List;

import com.tbd.lab2.models.Institution;

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
