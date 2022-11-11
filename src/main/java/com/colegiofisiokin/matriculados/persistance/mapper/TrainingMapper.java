package com.colegiofisiokin.matriculados.persistance.mapper;

import com.colegiofisiokin.matriculados.domain.Training;
import com.colegiofisiokin.matriculados.persistance.entities.Capacitacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TrainingMapper {
    @Mappings({
            @Mapping(source = "idCapacitaciones", target = "trainingId"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "institucion", target = "institucion"),
            @Mapping(source = "idMatriculado", target = "registeredId"),
            @Mapping(source = "matriculado", target = "registered")
    })
    Training toTraining(Capacitacion capacitacion);
    List<Training> toTrainings(List<Capacitacion> capacitaciones);

    @InheritInverseConfiguration
    Capacitacion toCapacitacion(Training training);
}
