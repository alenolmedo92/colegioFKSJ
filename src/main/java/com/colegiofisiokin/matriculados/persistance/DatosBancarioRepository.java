package com.colegiofisiokin.matriculados.persistance;

import com.colegiofisiokin.matriculados.domain.BankData;
import com.colegiofisiokin.matriculados.domain.repository.BankDataRepository;
import com.colegiofisiokin.matriculados.persistance.crud.DatosBancarioCrudRepository;
import com.colegiofisiokin.matriculados.persistance.crud.MatriculadoCrudRepository;
import com.colegiofisiokin.matriculados.persistance.entities.DatosBancario;
import com.colegiofisiokin.matriculados.persistance.entities.Matriculado;
import com.colegiofisiokin.matriculados.persistance.mapper.BankDataMapper;
import com.colegiofisiokin.matriculados.persistance.mapper.RegisteredMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DatosBancarioRepository implements BankDataRepository {
    @Autowired
    private DatosBancarioCrudRepository datosBancarioCrudRepository;
    @Autowired
    private MatriculadoCrudRepository matriculadoCrudRepository;
    @Autowired
    private BankDataMapper mapper;

    private RegisteredMapper rMapper;

    @Override
    public Optional<List<BankData>> getAllBankData() {
        return Optional.of(mapper.toBanksData((List<DatosBancario>)datosBancarioCrudRepository.findAll()));
    }

    @Override
    public Optional<BankData> getBankDataByregisteredId(int RegisteredId) {

        return Optional.of(mapper.toBankData(datosBancarioCrudRepository.findByIdMatriculado(RegisteredId)));
    }

    @Override
    public Optional<BankData> getBankDataByregisteredDni(String dni) {
        Matriculado matriculado = matriculadoCrudRepository.findByDni(dni);
        int idMatriculado = matriculado.getIdMatriculado();
        return Optional.of(mapper.toBankData(datosBancarioCrudRepository.findByIdMatriculado(idMatriculado)));
    }

    @Override
    public Optional<BankData> getBankDataByregisteredCuil(String cuil) {
        return Optional.of(mapper.toBankData(datosBancarioCrudRepository.findByCuil(cuil)));
    }

    @Override
    public BankData saveBankData(BankData bankData) {
        DatosBancario datosBancario = mapper.toDatosBancarios(bankData);
        return mapper.toBankData(datosBancarioCrudRepository.save(datosBancario));
    }
}
