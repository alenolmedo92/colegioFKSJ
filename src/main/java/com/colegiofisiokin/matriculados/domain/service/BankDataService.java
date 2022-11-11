package com.colegiofisiokin.matriculados.domain.service;

import com.colegiofisiokin.matriculados.domain.BankData;
import com.colegiofisiokin.matriculados.domain.repository.BankDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankDataService {
    @Autowired
    private BankDataRepository bankDataRepository;

    public Optional<List<BankData>> getAllBankData() {
        return bankDataRepository.getAllBankData();
    }

    public Optional<BankData> getBankDataByregisteredId(int RegisteredId) {

        return bankDataRepository.getBankDataByregisteredId(RegisteredId);
    }

    public Optional<BankData> getBankDataByregisteredDni(String dni) {
        return bankDataRepository.getBankDataByregisteredDni(dni);
    }

    public Optional<BankData> getBankDataByregisteredCuil(String cuil) {
        return bankDataRepository.getBankDataByregisteredCuil(cuil);
    }

    public BankData saveBankData(BankData bankData) {
        return bankDataRepository.saveBankData(bankData);
    }
}
