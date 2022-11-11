package com.colegiofisiokin.matriculados.domain.repository;

import com.colegiofisiokin.matriculados.domain.Registered;

import java.util.List;
import java.util.Optional;

public interface RegisteredRepository {
    Optional<List<Registered>> getAllRegistered();
    Registered getRegisteredById(int registeredId);
    Optional<Registered> getByDni(String dni);

    Registered saveRegistered(Registered registered);
}
