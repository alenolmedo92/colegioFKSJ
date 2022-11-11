package com.colegiofisiokin.matriculados.web.controller;

import com.colegiofisiokin.matriculados.domain.Sanction;
import com.colegiofisiokin.matriculados.domain.service.SanctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sanciones")
public class SanctionController {
    @Autowired
    private SanctionService sanctionService;

    @GetMapping("/bymatricula{matricula}")
    public ResponseEntity<List<Sanction>> getAllSancionesByRegisteredId(@PathVariable("matricula")int registeredId) {
        return sanctionService.getAllSancionesByRegisteredId(registeredId)
                .map(sanctions -> new ResponseEntity<>(sanctions, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/byfecha{fecha}")
    public ResponseEntity<List<Sanction>> getAllSancionesByDate(@PathVariable("fecha")String date) {
        return sanctionService.getAllSancionesByDate(date)
                .map(sanctions -> new ResponseEntity<>(sanctions, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/save")
    public ResponseEntity<Sanction> saveSanction(@RequestBody Sanction sanction) {
        return new ResponseEntity<>( sanctionService.saveSanction(sanction), HttpStatus.CREATED);
    }
}
