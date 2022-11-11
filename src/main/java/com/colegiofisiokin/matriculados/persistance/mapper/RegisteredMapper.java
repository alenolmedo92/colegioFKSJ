package com.colegiofisiokin.matriculados.persistance.mapper;


import com.colegiofisiokin.matriculados.domain.Registered;
import com.colegiofisiokin.matriculados.persistance.entities.Matriculado;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface RegisteredMapper {
    @Mappings({
            @Mapping(source = "idMatriculado", target = "registeredId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "surname"),
            @Mapping(source = "tipoDni", target = "dniType"),
            @Mapping(source = "dni", target = "dni"),
            @Mapping(source = "fechaNacimiento", target = "dateOfBirth"),
            @Mapping(source = "lugarNacimiento", target = "placeOfBirth"),
            @Mapping(source = "ciudadNacimiento", target = "cityOfBirth"),
            @Mapping(source = "paisNacimiento", target = "countryOfBirth"),
            @Mapping(source = "nacionalidad", target = "nationality"),
            @Mapping(source = "certificadoSuperintendencia", target = "superintendentCertificate"),
            @Mapping(source = "fechaRegistroSuperint", target = "superintendentRegistrationDate"),
            @Mapping(source = "fechaVencimientoSuper", target = "superintendentExpirationDate")
    })
    Registered toRegistered(Matriculado matriculado);
    List<Registered> toRegistereds (List<Matriculado> matriculados);


    @InheritInverseConfiguration
    @Mapping(target = "capacitaciones", ignore = true)
    @Mapping(target = "contactosProfesional", ignore = true)
    @Mapping(target = "sanciones", ignore = true)
    Matriculado toMatriculado (Registered registered);

}
