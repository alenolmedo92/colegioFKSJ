package com.colegiofisiokin.matriculados.persistance.mapper;

import com.colegiofisiokin.matriculados.domain.PersonalContact;
import com.colegiofisiokin.matriculados.persistance.entities.ContactoParticular;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonalContactMapper {
    @Mappings({
            @Mapping(source = "idContactoParticular", target = "personalContactId"),
            @Mapping(source = "calle", target = "street"),
            @Mapping(source = "numero", target = "number"),
            @Mapping(source = "cardinal", target = "cardinal"),
            @Mapping(source = "localidad", target = "location"),
            @Mapping(source = "departamento", target = "district"),
            @Mapping(source = "pais", target = "country"),
            @Mapping(source = "codigoPostal", target = "zipCode"),
            @Mapping(source = "telefonoFijo", target = "phone"),
            @Mapping(source = "telefonoMovil", target = "mobilePhone"),
            @Mapping(source = "email", target = "emailAddress"),
            @Mapping(source = "idMatriculado", target = "registeredId"),
    })
    PersonalContact toPersonalContact(ContactoParticular contactoParticular);

    List<PersonalContact> toPersonalContacts(List<ContactoParticular> contactosParticular);

    @InheritInverseConfiguration
    ContactoParticular toContactoParticular(PersonalContact personalContact);
}
