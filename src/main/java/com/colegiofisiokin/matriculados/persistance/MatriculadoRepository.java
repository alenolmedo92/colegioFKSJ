package com.colegiofisiokin.matriculados.persistance;

import com.colegiofisiokin.matriculados.domain.Registered;
import com.colegiofisiokin.matriculados.domain.repository.RegisteredRepository;
import com.colegiofisiokin.matriculados.persistance.crud.MatriculadoCrudRepository;
import com.colegiofisiokin.matriculados.persistance.entities.Matriculado;
import com.colegiofisiokin.matriculados.persistance.mapper.RegisteredMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MatriculadoRepository implements RegisteredRepository {
    @Autowired
    private MatriculadoCrudRepository matriculadoCrudRepository;
    @Autowired
    private RegisteredMapper mapper;

    @Override
    public Optional<List<Registered>> getAllRegistered() {
        List<Matriculado> matriculados = (List<Matriculado>) matriculadoCrudRepository.findAll();
        return Optional.of(mapper.toRegistereds(matriculados));
    }

    @Override
    public Registered getRegisteredById(int registeredId) {
        Matriculado matriculado = matriculadoCrudRepository.findById(registeredId);
        return mapper.toRegistered(matriculado);
    }

    @Override
    public Optional<Registered> getByDni(String dni) {
        Matriculado matriculado = matriculadoCrudRepository.findByDni(dni);
        return Optional.of(mapper.toRegistered(matriculado));
    }

    @Override
    public Registered saveRegistered(Registered registered) {
        Matriculado matriculado = mapper.toMatriculado(registered);
        return mapper.toRegistered(matriculadoCrudRepository.save(matriculado));
    }


}
