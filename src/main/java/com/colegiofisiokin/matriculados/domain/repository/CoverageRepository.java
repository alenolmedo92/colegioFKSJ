package com.colegiofisiokin.matriculados.domain.repository;

import com.colegiofisiokin.matriculados.domain.Coverage;


import java.util.List;
import java.util.Optional;

public interface CoverageRepository {
    Optional<List<Coverage>> getAllCoverage();
    Optional<Coverage> getCoverageByRegisteredId (int registeredId);
    Optional<Coverage> getCoverageByRegisteredDni (String dni);
    Coverage saveCoverage (Coverage coverage);
}
