package com.colegiofisiokin.matriculados.domain.service;

import com.colegiofisiokin.matriculados.domain.PersonalContact;
import com.colegiofisiokin.matriculados.domain.repository.PersonalContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalContactService {
    @Autowired
    private PersonalContactRepository personalContactrepository;

    public Optional<List<PersonalContact>> getAllPersonalContact() {
        return personalContactrepository.getAllPersonalContact();
    }

    public Optional<PersonalContact> getPersonalContactByRegisteredId(int registeredId) {
        return personalContactrepository.getPersonalContactByRegisteredId(registeredId);
    }

    public Optional<PersonalContact> getPersonalContactByRegistered(String dni) {
        return personalContactrepository.getPersonalContactByRegisteredDni(dni);
    }

    public PersonalContact savePersonalContact(PersonalContact personalContact) {
        return personalContactrepository.savePersonalContact(personalContact);
    }
}
