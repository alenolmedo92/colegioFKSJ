package com.colegiofisiokin.matriculados.domain.service;

import com.colegiofisiokin.matriculados.domain.Coverage;
import com.colegiofisiokin.matriculados.domain.repository.CoverageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoverageService {
    @Autowired
    private CoverageRepository coverageRepository;

    public Optional<List<Coverage>> getAllCoverage() {
        return coverageRepository.getAllCoverage();
    }

    public Optional<Coverage> getCoverageByRegisteredId(int registeredId) {
        return coverageRepository.getCoverageByRegisteredId(registeredId);
    }

    public Optional<Coverage> getCoverageByRegisteredDni(String dni) {
        return coverageRepository.getCoverageByRegisteredDni(dni);
    }

    public Coverage saveCoverage(Coverage coverage) {
        return coverageRepository.saveCoverage(coverage);
    }
}
