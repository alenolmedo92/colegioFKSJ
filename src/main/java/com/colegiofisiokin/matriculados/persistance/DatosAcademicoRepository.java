package com.colegiofisiokin.matriculados.persistance;


import com.colegiofisiokin.matriculados.domain.AcademicData;
import com.colegiofisiokin.matriculados.domain.repository.AcademicDataRepository;
import com.colegiofisiokin.matriculados.persistance.crud.DatosAcademicoCrudRepository;
import com.colegiofisiokin.matriculados.persistance.crud.MatriculadoCrudRepository;
import com.colegiofisiokin.matriculados.persistance.entities.DatosAcademico;
import com.colegiofisiokin.matriculados.persistance.entities.Matriculado;
import com.colegiofisiokin.matriculados.persistance.mapper.AcademicDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DatosAcademicoRepository implements AcademicDataRepository {
    @Autowired
    private DatosAcademicoCrudRepository datosAcademicoCrudRepository;
    @Autowired
    private MatriculadoCrudRepository matriculadoCrudRepository;
    @Autowired
    private AcademicDataMapper mapper;

    @Override
    public Optional<AcademicData> getAcademicDataByRegisteredId(int registeredId) {
        DatosAcademico datosAcademico = datosAcademicoCrudRepository.findByIdMatriculado(registeredId);
        return Optional.of(mapper.toAcademicData(datosAcademico));
    }

    @Override
    public Optional<AcademicData> getAcademicDataByDni(String dni) {
        Matriculado matriculado = matriculadoCrudRepository.findByDni(dni);
        int id = matriculado.getIdMatriculado();
        return Optional.of(mapper.toAcademicData(datosAcademicoCrudRepository.findByIdMatriculado(id)));
    }

    @Override
    public AcademicData saveAcademicData(AcademicData academicData) {
        DatosAcademico datosAcademico = mapper.toDatosAcademico(academicData);
        return mapper.toAcademicData(datosAcademicoCrudRepository.save(datosAcademico));
    }

    @Override
    public Integer countByState(String state) {
        return datosAcademicoCrudRepository.countByEstado(state);
    }
}
