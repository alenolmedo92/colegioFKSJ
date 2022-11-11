package com.colegiofisiokin.matriculados.persistance;

import com.colegiofisiokin.matriculados.domain.Training;
import com.colegiofisiokin.matriculados.domain.repository.TrainingRepository;
import com.colegiofisiokin.matriculados.persistance.crud.CapacitacionCrudRepository;
import com.colegiofisiokin.matriculados.persistance.entities.Capacitacion;
import com.colegiofisiokin.matriculados.persistance.mapper.TrainingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CapacitacionRepository implements TrainingRepository {
    @Autowired
    private CapacitacionCrudRepository capacitacionCrudRepository;
    @Autowired
    private TrainingMapper mapper;

    @Override
    public Optional<List<Training>> getTrainingByRegisteredId(int registeredId) {
        List<Capacitacion> capacitaciones = capacitacionCrudRepository.findByIdMatriculado(registeredId);
        return Optional.of(mapper.toTrainings(capacitaciones));
    }

    @Override
    public Optional<List<Training>> getTrainingByTitle(String title) {
        List<Capacitacion> capacitaciones = capacitacionCrudRepository.findByTituloLike(title);
        return Optional.of(mapper.toTrainings(capacitaciones));
    }

    @Override
    public Optional<List<Training>> getTrainingByDate(String date) {
        List<Capacitacion> capacitaciones = capacitacionCrudRepository.findByFechaLike(date);
        return Optional.of(mapper.toTrainings(capacitaciones));
    }

    @Override
    public Optional<List<Training>> getTrainingInstitution(String institution) {
        List<Capacitacion> capacitaciones = capacitacionCrudRepository.findByInstitucionLike(institution);
        return Optional.of(mapper.toTrainings(capacitaciones));
    }

    @Override
    public Training saveTraining(Training training) {
        Capacitacion capacitacion = mapper.toCapacitacion(training);
        return mapper.toTraining(capacitacionCrudRepository.save(capacitacion));
    }
}
