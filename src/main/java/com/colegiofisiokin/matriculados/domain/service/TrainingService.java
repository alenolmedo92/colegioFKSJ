package com.colegiofisiokin.matriculados.domain.service;

import com.colegiofisiokin.matriculados.domain.Training;
import com.colegiofisiokin.matriculados.domain.repository.TrainingRepository;
import com.colegiofisiokin.matriculados.persistance.entities.Capacitacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingService {
    @Autowired
    private TrainingRepository trainingRepository;

    public Optional<List<Training>> getTrainingByRegisteredId(int registeredId) {
        return trainingRepository.getTrainingByRegisteredId(registeredId);
    }

    public Optional<List<Training>> getTrainingByTitle(String title) {
        return trainingRepository.getTrainingByTitle(title);
    }

    public Optional<List<Training>> getTrainingByDate(String date) {
        return trainingRepository.getTrainingByDate(date);
    }

    public Optional<List<Training>> getTrainingInstitution(String institution) {
        return trainingRepository.getTrainingInstitution(institution);
    }

    public Training saveTraining(Training training) {
        return trainingRepository.saveTraining(training);
    }
}
