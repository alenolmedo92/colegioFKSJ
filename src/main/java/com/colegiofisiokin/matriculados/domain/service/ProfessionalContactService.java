package com.colegiofisiokin.matriculados.domain.service;

import com.colegiofisiokin.matriculados.domain.ProfessionalContact;
import com.colegiofisiokin.matriculados.domain.Registered;
import com.colegiofisiokin.matriculados.domain.repository.ProfessionalContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessionalContactService {
    @Autowired
    private ProfessionalContactRepository profesionalContactRepository;

    public Optional<List<ProfessionalContact>> getProfessionalContactById(int registeredId){
        return profesionalContactRepository.getProfessionalContactById(registeredId);
    }

    public Optional<List<ProfessionalContact>> getProfessionalContactByDni(String dni){
        return profesionalContactRepository.getProfessionalContactByDni(dni);
    }

    public Optional<List<ProfessionalContact>> getAllProfContByDistrict(String district) {
        return profesionalContactRepository.getAllProfContByDistrict(district);
    }

    public ProfessionalContact saveProfessionalContact(ProfessionalContact professionalContact) {
        return profesionalContactRepository.saveProfessionalContact(professionalContact);
    }

}
