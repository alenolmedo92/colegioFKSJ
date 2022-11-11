package com.colegiofisiokin.matriculados.persistance.mapper;



import com.colegiofisiokin.matriculados.domain.Sanction;
import com.colegiofisiokin.matriculados.persistance.entities.Sancion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {RegisteredMapper.class})
public interface SanctionMapper {
    @Mappings({
            @Mapping(source = "idSancion", target = "santionId"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "idMatriculado", target = "registeredId"),
            @Mapping(source = "matriculado", target = "registered")
    })
    Sanction toSanction (Sancion sancion);
    List<Sanction> toSanctions(List<Sancion> sancion);

    @InheritInverseConfiguration
    Sancion toSancion (Sanction sanction);
}
