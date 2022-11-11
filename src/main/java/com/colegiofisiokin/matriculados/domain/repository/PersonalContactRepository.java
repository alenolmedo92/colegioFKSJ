package com.colegiofisiokin.matriculados.domain.repository;

import com.colegiofisiokin.matriculados.domain.PersonalContact;


import java.util.List;
import java.util.Optional;

public interface PersonalContactRepository {
    Optional<List<PersonalContact>> getAllPersonalContact();
    Optional<PersonalContact> getPersonalContactByRegisteredId(int registeredId);
    Optional<PersonalContact> getPersonalContactByRegisteredDni(String dni);
    PersonalContact savePersonalContact(PersonalContact personalContact);
}
