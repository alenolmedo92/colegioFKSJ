package com.colegiofisiokin.matriculados.web.controller;


import com.colegiofisiokin.matriculados.domain.ProfessionalContact;
import com.colegiofisiokin.matriculados.domain.Registered;
import com.colegiofisiokin.matriculados.domain.service.ProfessionalContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contactomatriculados")
public class ProfessionalContactController {
    @Autowired
    private ProfessionalContactService professionalContactService;

    @GetMapping("/bymatricula{matricula}")
    public ResponseEntity<List<ProfessionalContact>> getProfessionalContactById(@PathVariable("matricula") int registeredId){
        return professionalContactService.getProfessionalContactById(registeredId)
                .map(professionalContacts -> new ResponseEntity<>(professionalContacts, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/bydni{dni}")
    public ResponseEntity<List<ProfessionalContact>> getProfessionalContactByDni(@PathVariable("dni")String dni){
        return professionalContactService.getProfessionalContactByDni(dni)
                .map(ProfessionalContact -> new ResponseEntity<>(ProfessionalContact, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/bydepartamento{departamento}")
    public ResponseEntity<List<ProfessionalContact>> getAllProfContByDistrict(@PathVariable("departamento") String district){
        return professionalContactService.getAllProfContByDistrict(district)
                .map(professionalContacts -> new ResponseEntity<>(professionalContacts, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<ProfessionalContact> saveProfessionalContact(@RequestBody ProfessionalContact professionalContact) {
        return new ResponseEntity<>(professionalContactService.saveProfessionalContact(professionalContact), HttpStatus.CREATED);
    }
}
