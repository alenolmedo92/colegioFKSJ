package com.colegiofisiokin.matriculados.persistance.crud;

import com.colegiofisiokin.matriculados.persistance.entities.DatosAcademico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DatosAcademicoCrudRepository extends CrudRepository<DatosAcademico, Integer> {
    DatosAcademico findByIdMatriculado(int idMatriculado);

    @Query(value = "SELECT COUNT(estado) FROM datos_academicos WHERE estado LIKE %?%", nativeQuery = true)
    Integer countByEstado(String estado);
}
