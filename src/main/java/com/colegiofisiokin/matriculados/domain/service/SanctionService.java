package com.colegiofisiokin.matriculados.domain.service;

import com.colegiofisiokin.matriculados.domain.Sanction;
import com.colegiofisiokin.matriculados.domain.repository.SanctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SanctionService {
    @Autowired
    private SanctionRepository sanctionRepository;

    public Optional<List<Sanction>> getAllSancionesByRegisteredId(int registeredId) {
        return sanctionRepository.getAllSancionesByRegisteredId(registeredId);
    }

    public Optional<List<Sanction>> getAllSancionesByDate(String date) {
        return sanctionRepository.getAllSancionesByDate(date);
    }

    public Sanction saveSanction(Sanction sanction) {
        return sanctionRepository.saveSanction(sanction);
    }
}
