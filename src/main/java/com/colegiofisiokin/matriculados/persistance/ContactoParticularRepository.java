package com.colegiofisiokin.matriculados.persistance;

import com.colegiofisiokin.matriculados.domain.PersonalContact;
import com.colegiofisiokin.matriculados.domain.repository.PersonalContactRepository;
import com.colegiofisiokin.matriculados.persistance.crud.ContactoParticularCrudRepository;
import com.colegiofisiokin.matriculados.persistance.crud.MatriculadoCrudRepository;
import com.colegiofisiokin.matriculados.persistance.entities.ContactoParticular;
import com.colegiofisiokin.matriculados.persistance.entities.Matriculado;
import com.colegiofisiokin.matriculados.persistance.mapper.PersonalContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ContactoParticularRepository implements PersonalContactRepository {
    @Autowired
    private ContactoParticularCrudRepository contactoParticularCrudRepository;
    @Autowired
    private MatriculadoCrudRepository matriculadoCrudRepository;
    @Autowired
    private PersonalContactMapper mapper;

    @Override
    public Optional<List<PersonalContact>> getAllPersonalContact() {
        return Optional.of(mapper.toPersonalContacts((List<ContactoParticular>) contactoParticularCrudRepository.findAll()));
    }

    @Override
    public Optional<PersonalContact> getPersonalContactByRegisteredId(int registeredId) {
        return Optional.of(mapper.toPersonalContact(contactoParticularCrudRepository.findByIdMatriculado(registeredId)));
    }

    @Override
    public Optional<PersonalContact> getPersonalContactByRegisteredDni(String dni) {
        Matriculado matriculado = matriculadoCrudRepository.findByDni(dni);
        int idMatriculado = matriculado.getIdMatriculado();
        return Optional.of(mapper.toPersonalContact(contactoParticularCrudRepository.findByIdMatriculado(idMatriculado)));
    }

    @Override
    public PersonalContact savePersonalContact(PersonalContact personalContact) {
        ContactoParticular contactoParticular = mapper.toContactoParticular(personalContact);
        return mapper.toPersonalContact(contactoParticularCrudRepository.save(contactoParticular));
    }
}
