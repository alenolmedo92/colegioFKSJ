package com.colegiofisiokin.matriculados.domain.repository;

import com.colegiofisiokin.matriculados.domain.AcademicData;


import java.util.Optional;

public interface AcademicDataRepository {
    Optional<AcademicData> getAcademicDataByRegisteredId(int registeredId);
    Optional<AcademicData> getAcademicDataByDni(String dni);
    AcademicData saveAcademicData(AcademicData academicData);

    Integer countByState(String state);
}
