package com.colegiofisiokin.matriculados.web.controller;

import com.colegiofisiokin.matriculados.domain.Training;
import com.colegiofisiokin.matriculados.domain.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/capacitaciones")
public class TrainingController {
    @Autowired
    private TrainingService trainingService;

    @GetMapping("/bymatricula{matricula}")
    public ResponseEntity<List<Training>> getTrainingByRegisteredId(@PathVariable("matricula")int registeredId) {
        return trainingService.getTrainingByRegisteredId(registeredId)
                .map(trainings -> new ResponseEntity<>(trainings, HttpStatus.OK))
                .orElse( new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/byfecha{fecha}")
    public ResponseEntity<List<Training>> getTrainingByDate(@PathVariable("fecha")String date) {
        return trainingService.getTrainingByDate(date)
                .map(training -> new ResponseEntity<>(training, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/byinstitucion{inst}")
    public ResponseEntity<List<Training>> getTrainingInstitution(@PathVariable("inst")String institution) {
        return trainingService.getTrainingInstitution(institution)
                .map(trainings -> new ResponseEntity<>(trainings, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Training> saveTraining(@RequestBody Training training) {
        return new ResponseEntity<>(trainingService.saveTraining(training), HttpStatus.CREATED);
    }
}
