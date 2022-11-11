package com.colegiofisiokin.matriculados.domain.service;

import com.colegiofisiokin.matriculados.domain.Registered;
import com.colegiofisiokin.matriculados.domain.repository.RegisteredRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisteredService {
    @Autowired
    private RegisteredRepository registeredRepository;

    public Optional<List<Registered>> getAllRegistered(){
        return registeredRepository.getAllRegistered();
    }

    public Registered getRegisteredById(int registeredId) {
        return registeredRepository.getRegisteredById(registeredId);
    }

    public Optional<Registered> getByDni(String dni) {
        return registeredRepository.getByDni(dni);
    }

    public Registered saveRegistered(Registered registered) {
        return registeredRepository.saveRegistered(registered);
    }
}
