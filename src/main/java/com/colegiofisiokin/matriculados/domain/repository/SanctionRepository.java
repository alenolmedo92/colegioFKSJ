package com.colegiofisiokin.matriculados.domain.repository;

import com.colegiofisiokin.matriculados.domain.Sanction;


import java.util.List;
import java.util.Optional;

public interface SanctionRepository {
    Optional<List<Sanction>> getAllSancionesByRegisteredId(int registeredId);
    Optional<List<Sanction>> getAllSancionesByDate(String date);
    Sanction saveSanction(Sanction sanction);
}
