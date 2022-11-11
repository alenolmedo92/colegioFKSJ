package com.colegiofisiokin.matriculados.persistance;

import com.colegiofisiokin.matriculados.domain.Sanction;
import com.colegiofisiokin.matriculados.domain.repository.SanctionRepository;
import com.colegiofisiokin.matriculados.persistance.crud.SancionCrudRepository;
import com.colegiofisiokin.matriculados.persistance.entities.Sancion;
import com.colegiofisiokin.matriculados.persistance.mapper.SanctionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SancionRepository implements SanctionRepository {
    @Autowired
    private SancionCrudRepository sancionCrudRepository;
    @Autowired
    private SanctionMapper mapper;

    @Override
    public Optional<List<Sanction>> getAllSancionesByRegisteredId(int registeredId) {
        List<Sancion> sanciones = sancionCrudRepository.findByIdMatriculado(registeredId);
        return Optional.of(mapper.toSanctions(sanciones));
    }

    @Override
    public Optional<List<Sanction>> getAllSancionesByDate(String date) {
        List<Sancion> sanciones = sancionCrudRepository.findByFechaLike(date);
        return Optional.of(mapper.toSanctions(sanciones));
    }

    @Override
    public Sanction saveSanction(Sanction sanction) {
        Sancion sancion = mapper.toSancion(sanction);
        return mapper.toSanction(sancionCrudRepository.save(sancion));
    }

}
