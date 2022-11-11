package com.colegiofisiokin.matriculados.domain.repository;

import com.colegiofisiokin.matriculados.domain.BankData;


import java.util.List;
import java.util.Optional;

public interface BankDataRepository {
    Optional<List<BankData>> getAllBankData();
    Optional<BankData> getBankDataByregisteredId(int RegisteredId);
    Optional<BankData> getBankDataByregisteredDni(String dni);
    Optional<BankData> getBankDataByregisteredCuil(String cuil);
    BankData saveBankData(BankData bankData);
}
