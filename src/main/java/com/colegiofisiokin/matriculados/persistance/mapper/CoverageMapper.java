package com.colegiofisiokin.matriculados.persistance.mapper;

import com.colegiofisiokin.matriculados.domain.Coverage;
import com.colegiofisiokin.matriculados.persistance.entities.Cobertura;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoverageMapper {
    @Mappings({
            @Mapping(source = "idCobertura", target = "coverageId"),
            @Mapping(source = "prepaga", target = "prepaid"),
            @Mapping(source = "seguroVida", target = "lifeInsurance"),
            @Mapping(source = "seguroMalapraxis", target = "malpracticeInsurance"),
            @Mapping(source = "numeroPoliza", target = "policyNumber"),
            @Mapping(source = "numeroCertificado", target = "certNumber"),
            @Mapping(source = "fechaVigenciaPoliza", target = "policyValidityDate"),
            @Mapping(source = "realizaDomicilio", target = "homeCare"),
            @Mapping(source = "idMatriculado", target = "registeredId"),
    })
    Coverage toCoverage(Cobertura cobertura);
    List<Coverage> toCoverages(List<Cobertura> coberturas);

    @InheritInverseConfiguration
    Cobertura toCobertura(Coverage coverage);
}
