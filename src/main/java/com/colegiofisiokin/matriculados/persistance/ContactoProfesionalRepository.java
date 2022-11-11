package com.colegiofisiokin.matriculados.persistance;


import com.colegiofisiokin.matriculados.domain.ProfessionalContact;
import com.colegiofisiokin.matriculados.domain.Registered;
import com.colegiofisiokin.matriculados.domain.repository.ProfessionalContactRepository;
import com.colegiofisiokin.matriculados.persistance.crud.ContactoProfesionalCrudRepository;
import com.colegiofisiokin.matriculados.persistance.crud.MatriculadoCrudRepository;
import com.colegiofisiokin.matriculados.persistance.entities.ContactoProfesional;
import com.colegiofisiokin.matriculados.persistance.entities.Matriculado;
import com.colegiofisiokin.matriculados.persistance.mapper.ProfessionalContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ContactoProfesionalRepository implements ProfessionalContactRepository {
    @Autowired
    private ContactoProfesionalCrudRepository contactoProfesionalCrudRepository;
    @Autowired
    private MatriculadoCrudRepository matriculadoCrudRepository;
    @Autowired
    private ProfessionalContactMapper mapper;

    @Override
    public Optional<List<ProfessionalContact>> getProfessionalContactById(int registeredId) {
        List<ContactoProfesional> contactosProfesional = contactoProfesionalCrudRepository.findByIdMatriculado(registeredId);
        return  Optional.of(mapper.toProfessionalContacts(contactosProfesional));
    }

    @Override
    public Optional<List<ProfessionalContact>> getProfessionalContactByDni(String dni) {
        Matriculado matriculado = matriculadoCrudRepository.findByDni(dni);
        int id = matriculado.getIdMatriculado();
        return Optional.of(mapper.toProfessionalContacts(contactoProfesionalCrudRepository.findByIdMatriculado(id)));
    }

    @Override
    public Optional<List<ProfessionalContact>> getAllProfContByDistrict(String district){
        List<ContactoProfesional> matriculados = contactoProfesionalCrudRepository.getAllProfContByDistrict(district);
        return Optional.of(mapper.toProfessionalContacts(matriculados));
    }


    @Override
    public ProfessionalContact saveProfessionalContact(ProfessionalContact professionalContact) {
        ContactoProfesional contactoProfesional = mapper.toContactoProfesional(professionalContact);
        return mapper.toProfessionalContact(contactoProfesionalCrudRepository.save(contactoProfesional));
    }
}
