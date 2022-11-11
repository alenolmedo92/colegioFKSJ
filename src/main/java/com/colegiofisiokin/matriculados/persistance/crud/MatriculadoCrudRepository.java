package com.colegiofisiokin.matriculados.persistance.crud;

import com.colegiofisiokin.matriculados.persistance.entities.Matriculado;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MatriculadoCrudRepository extends CrudRepository<Matriculado, Integer> {
    Matriculado findByDni(String dni);

    Matriculado findById(int idMatriculado);


}
