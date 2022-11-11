package com.colegiofisiokin.matriculados.persistance.crud;

import com.colegiofisiokin.matriculados.persistance.entities.DatosBancario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DatosBancarioCrudRepository extends CrudRepository<DatosBancario, Integer> {
    DatosBancario findByIdMatriculado(int idMatriculado);
    DatosBancario findByCuil(String cuil);
}
