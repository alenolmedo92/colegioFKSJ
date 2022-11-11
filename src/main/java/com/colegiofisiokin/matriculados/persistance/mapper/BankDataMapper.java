package com.colegiofisiokin.matriculados.persistance.mapper;

import com.colegiofisiokin.matriculados.domain.BankData;
import com.colegiofisiokin.matriculados.persistance.entities.DatosBancario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BankDataMapper {
    @Mappings({
            @Mapping(source = "idDatosBancarios", target = "bankDataId"),
            @Mapping(source = "cuil", target = "cuil"),
            @Mapping(source = "ingresosBrutos", target = "grossRevenue"),
            @Mapping(source = "cbuComafi", target = "comafiCbu"),
            @Mapping(source = "cbuGalicia", target = "galiciaCbu"),
            @Mapping(source = "cbuSanjuan", target = "sanjuanCbu"),
            @Mapping(source = "idMatriculado", target = "registeredId")
    })
    BankData toBankData(DatosBancario datosBancario);
    List<BankData> toBanksData(List<DatosBancario> datosBancario);

    @InheritInverseConfiguration
    DatosBancario toDatosBancarios(BankData bankData);

}
