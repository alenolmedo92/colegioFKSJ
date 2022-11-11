package com.colegiofisiokin.matriculados.persistance.mapper;

import com.colegiofisiokin.matriculados.domain.ProfessionalContact;
import com.colegiofisiokin.matriculados.persistance.entities.ContactoProfesional;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProfessionalContactMapper {
    @Mappings({
            @Mapping(source = "idContactoProfesional", target = "professionalContactId"),
            @Mapping(source = "lugar", target = "place"),
            @Mapping(source = "calle", target = "street"),
            @Mapping(source = "numero", target = "number"),
            @Mapping(source = "cardinal", target = "cardinal"),
            @Mapping(source = "departamento", target = "district"),
            @Mapping(source = "barrio", target = "neighborhood"),
            @Mapping(source = "telefono1", target = "phone1"),
            @Mapping(source = "telefono2", target = "phone2"),
            @Mapping(source = "idMatriculado", target = "registeredId"),
            @Mapping(source = "matriculado", target = "registered")
    })
    ProfessionalContact toProfessionalContact(ContactoProfesional contactoProfesional);
    List<ProfessionalContact> toProfessionalContacts(List<ContactoProfesional> contactosProfesional);

    @InheritInverseConfiguration
    ContactoProfesional toContactoProfesional(ProfessionalContact professionalContactId);
}
