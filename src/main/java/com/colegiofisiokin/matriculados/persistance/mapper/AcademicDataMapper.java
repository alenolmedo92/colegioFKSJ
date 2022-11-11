package com.colegiofisiokin.matriculados.persistance.mapper;

import com.colegiofisiokin.matriculados.domain.AcademicData;
import com.colegiofisiokin.matriculados.persistance.entities.DatosAcademico;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AcademicDataMapper {

    @Mappings({
            @Mapping(source = "idDatosAcademico", target = "academicDataId"),
            @Mapping(source = "profesion", target = "profession"),
            @Mapping(source = "titulo", target = "degree"),
            @Mapping(source = "institucion", target = "institution"),
            @Mapping(source = "fechaEgreso", target = "graduationDate"),
            @Mapping(source = "ciudad", target = "city"),
            @Mapping(source = "pais", target = "country"),
            @Mapping(source = "jurisdiccion", target = "jurisdiction"),
            @Mapping(source = "fecharRegistro", target = "registerDate"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "fechaPasividad", target = "passivityDate"),
            @Mapping(source = "resolucion", target = "resolution"),
            @Mapping(source = "fechaResolucion", target = "resolutionDate"),
            @Mapping(source = "ciudadResolucion", target = "resolutionCity"),
            @Mapping(source = "revalidaTitulo", target = "degreeRevalidation"),
            @Mapping(source = "especialidad", target = "specialization"),
            @Mapping(source = "idMatriculado", target = "registeredId")
    })
    AcademicData toAcademicData(DatosAcademico datosAcademico);
    List<AcademicData> toAcademicsData (List<DatosAcademico> datosAcademicos);

    @InheritInverseConfiguration
    DatosAcademico toDatosAcademico(AcademicData academicData);
}
