package com.colegiofisiokin.matriculados.web.controller;

import com.colegiofisiokin.matriculados.domain.BankData;
import com.colegiofisiokin.matriculados.domain.service.BankDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datosbancarios")
public class BankDataController {
    @Autowired
    private BankDataService bankDataService;

    @GetMapping("/all")
    public ResponseEntity<List<BankData>> getAllBankData() {
        return bankDataService.getAllBankData()
                .map(bankData -> new ResponseEntity<>(bankData, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/bymatricula{matricula}")
    public ResponseEntity<BankData> getBankDataByregisteredId(@PathVariable("matricula")int RegisteredId) {
        return bankDataService.getBankDataByregisteredId(RegisteredId)
                .map(bankData -> new ResponseEntity<>(bankData, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/bydni{dni}")
    public ResponseEntity<BankData> getBankDataByregisteredDni(@PathVariable("dni")String dni) {
        return bankDataService.getBankDataByregisteredDni(dni)
                .map(bankData -> new ResponseEntity<>(bankData, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/bycuil{cuil}")
    public ResponseEntity<BankData> getBankDataByregisteredCuil(@PathVariable("cuil")String cuil) {
        return bankDataService.getBankDataByregisteredCuil(cuil).
                map(bankData -> new ResponseEntity<>(bankData, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<BankData> saveBankData(@RequestBody BankData bankData) {
        return new ResponseEntity<>(bankDataService.saveBankData(bankData), HttpStatus.CREATED);
    }
}
