package com.colegiofisiokin.matriculados.persistance.crud;

import com.colegiofisiokin.matriculados.persistance.entities.Sancion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SancionCrudRepository extends CrudRepository<Sancion, Integer> {
    List<Sancion> findByIdMatriculado(int idMatriculado);
    List<Sancion> findByFechaLike(String fecha);
}
