package com.colegiofisiokin.matriculados.web.controller;

import com.colegiofisiokin.matriculados.domain.Coverage;
import com.colegiofisiokin.matriculados.domain.repository.CoverageRepository;
import com.colegiofisiokin.matriculados.domain.service.CoverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cobertura")
public class CoverageController {
    @Autowired
    private CoverageService coverageService;

    @GetMapping("/all")
    public ResponseEntity<List<Coverage>> getAllCoverage() {
        return coverageService.getAllCoverage()
                .map(coverage -> new ResponseEntity<>(coverage, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/bymatricula{matricula}")
    public ResponseEntity<Coverage> getCoverageByRegisteredId(@PathVariable("matricula")int registeredId) {
        return coverageService.getCoverageByRegisteredId(registeredId)
                .map(coverage -> new ResponseEntity<>(coverage, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/bydni{dni}")
    public ResponseEntity<Coverage> getCoverageByRegisteredDni(@PathVariable("dni")String dni) {
        return coverageService.getCoverageByRegisteredDni(dni)
                .map(coverage -> new ResponseEntity<>(coverage, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Coverage> saveCoverage(@RequestBody Coverage coverage) {
        return new ResponseEntity<>(coverageService.saveCoverage(coverage), HttpStatus.CREATED) ;
    }
}
