package com.colegiofisiokin.matriculados.domain.repository;

import com.colegiofisiokin.matriculados.domain.Training;
import com.colegiofisiokin.matriculados.persistance.entities.Capacitacion;

import java.util.List;
import java.util.Optional;

public interface TrainingRepository {
    Optional<List<Training>> getTrainingByRegisteredId(int registeredId);
    Optional<List<Training>> getTrainingByTitle(String title);
    Optional<List<Training>> getTrainingByDate(String date);
    Optional<List<Training>> getTrainingInstitution(String institution);
    Training saveTraining(Training training);
}
