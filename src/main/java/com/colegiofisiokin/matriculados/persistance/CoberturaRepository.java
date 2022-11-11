package com.colegiofisiokin.matriculados.persistance;


import com.colegiofisiokin.matriculados.domain.Coverage;
import com.colegiofisiokin.matriculados.domain.repository.CoverageRepository;
import com.colegiofisiokin.matriculados.persistance.crud.CoberturaCrudRepository;
import com.colegiofisiokin.matriculados.persistance.crud.MatriculadoCrudRepository;
import com.colegiofisiokin.matriculados.persistance.entities.Cobertura;
import com.colegiofisiokin.matriculados.persistance.entities.Matriculado;
import com.colegiofisiokin.matriculados.persistance.mapper.CoverageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CoberturaRepository implements CoverageRepository {
    @Autowired
    private CoberturaCrudRepository coberturaCrudRepository;
    @Autowired
    private MatriculadoCrudRepository matriculadoCrudRepository;
    @Autowired
    private CoverageMapper mapper;

    @Override
    public Optional<List<Coverage>> getAllCoverage() {
        return Optional.of(mapper.toCoverages((List<Cobertura>) coberturaCrudRepository.findAll()));
    }

    @Override
    public Optional<Coverage> getCoverageByRegisteredId(int registeredId) {
        return Optional.of(mapper.toCoverage(coberturaCrudRepository.findByIdMatriculado(registeredId)));
    }

    @Override
    public Optional<Coverage> getCoverageByRegisteredDni(String dni) {
        Matriculado matriculado = matriculadoCrudRepository.findByDni(dni);
        int id = matriculado.getIdMatriculado();
        return Optional.of(mapper.toCoverage(coberturaCrudRepository.findByIdMatriculado(id)));
    }

    @Override
    public Coverage saveCoverage(Coverage coverage) {
        Cobertura cobertura = mapper.toCobertura(coverage);
        return mapper.toCoverage(coberturaCrudRepository.save(cobertura));
    }
}
