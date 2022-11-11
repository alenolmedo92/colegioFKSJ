package com.colegiofisiokin.matriculados.domain.service;

import com.colegiofisiokin.matriculados.domain.AcademicData;
import com.colegiofisiokin.matriculados.domain.repository.AcademicDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AcademicDataService {
    @Autowired
    private AcademicDataRepository academicDataRepository;

    public Optional<AcademicData> getAcademicDataByRegisteredId(int registeredId) {
        return academicDataRepository.getAcademicDataByRegisteredId(registeredId);
    }

    public Optional<AcademicData> getAcademicDataByDni(String dni) {
        return academicDataRepository.getAcademicDataByDni(dni);
    }

    public AcademicData saveAcademicData(AcademicData academicData) {
        return academicDataRepository.saveAcademicData(academicData);
    }

    public Integer countByState(String state) {
        return academicDataRepository.countByState(state);
    }
}
