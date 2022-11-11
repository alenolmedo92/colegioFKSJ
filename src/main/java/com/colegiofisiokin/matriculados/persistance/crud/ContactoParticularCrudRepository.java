package com.colegiofisiokin.matriculados.persistance.crud;

import com.colegiofisiokin.matriculados.persistance.entities.ContactoParticular;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ContactoParticularCrudRepository extends CrudRepository<ContactoParticular, Integer> {
    ContactoParticular findByIdMatriculado(int idMatriculado);

}
