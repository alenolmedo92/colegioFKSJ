package com.colegiofisiokin.matriculados.persistance.crud;

import com.colegiofisiokin.matriculados.persistance.entities.Cobertura;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CoberturaCrudRepository extends CrudRepository<Cobertura, Integer> {
    Cobertura findByIdMatriculado(int idMatriculado);
}
