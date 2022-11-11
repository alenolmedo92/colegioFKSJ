package com.colegiofisiokin.matriculados.domain.repository;

import com.colegiofisiokin.matriculados.domain.ProfessionalContact;
import com.colegiofisiokin.matriculados.domain.Registered;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProfessionalContactRepository {
    Optional<List<ProfessionalContact>> getProfessionalContactById( int registeredId);
    Optional<List<ProfessionalContact>> getProfessionalContactByDni(String dni);
    ProfessionalContact saveProfessionalContact(ProfessionalContact professionalContact);

    Optional<List<ProfessionalContact>> getAllProfContByDistrict(String district);
}
