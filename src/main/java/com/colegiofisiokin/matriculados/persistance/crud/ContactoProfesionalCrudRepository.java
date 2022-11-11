package com.colegiofisiokin.matriculados.persistance.crud;

import com.colegiofisiokin.matriculados.domain.ProfessionalContact;
import com.colegiofisiokin.matriculados.persistance.entities.ContactoProfesional;
import com.colegiofisiokin.matriculados.persistance.entities.Matriculado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ContactoProfesionalCrudRepository extends CrudRepository<ContactoProfesional, Integer> {
    List<ContactoProfesional> findByIdMatriculado (int idMatriculado);
    @Query(value = "SELECT * FROM contacto_profesional WHERE departamento LIKE %?%", nativeQuery = true)
    List<ContactoProfesional> getAllProfContByDistrict(String district);
}
