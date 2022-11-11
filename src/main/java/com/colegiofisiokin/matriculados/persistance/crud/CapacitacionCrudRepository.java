package com.colegiofisiokin.matriculados.persistance.crud;

import com.colegiofisiokin.matriculados.persistance.entities.Capacitacion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CapacitacionCrudRepository extends CrudRepository<Capacitacion, Integer> {
    List<Capacitacion> findByIdMatriculado(int idMatriculado);
    List<Capacitacion> findByTituloLike(String titulo);
    List<Capacitacion> findByFechaLike(String fecha);
    List<Capacitacion> findByInstitucionLike(String institucion);
}
