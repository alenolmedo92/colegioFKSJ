package com.colegiofisiokin.matriculados.web.controller;

import com.colegiofisiokin.matriculados.domain.AcademicData;
import com.colegiofisiokin.matriculados.domain.service.AcademicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/datosacademicos")
public class AcademicDataController {
    @Autowired
    private AcademicDataService academicDataService;

    @GetMapping("/bymatricula{matricula}")
    public ResponseEntity<AcademicData> getAcademicDataByRegisteredId(@PathVariable("matricula")int registeredId) {
        return academicDataService.getAcademicDataByRegisteredId(registeredId)
                .map(academicData -> new ResponseEntity<>(academicData, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/bydni{dni}")
    public ResponseEntity<AcademicData> getAcademicDataByDni(@PathVariable("dni")String dni) {
        return academicDataService.getAcademicDataByDni(dni)
                .map(academicData -> new ResponseEntity<>(academicData, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/estado{estado}")
    public ResponseEntity<Integer> countByState(@PathVariable("estado") String state){
        return new ResponseEntity<>(academicDataService.countByState(state), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<AcademicData> saveAcademicData(@RequestBody AcademicData academicData) {
        return new ResponseEntity<>(academicDataService.saveAcademicData(academicData), HttpStatus.CREATED);
    }


}
