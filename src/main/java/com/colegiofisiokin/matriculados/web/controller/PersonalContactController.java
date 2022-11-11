package com.colegiofisiokin.matriculados.web.controller;

import com.colegiofisiokin.matriculados.domain.PersonalContact;
import com.colegiofisiokin.matriculados.domain.repository.PersonalContactRepository;
import com.colegiofisiokin.matriculados.domain.service.PersonalContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contactopersonal")
public class PersonalContactController {
    @Autowired
    private PersonalContactService personalContactService;

    @GetMapping("/all")
    public ResponseEntity<List<PersonalContact>> getAllPersonalContact() {
        return personalContactService.getAllPersonalContact()
                .map(personalContact -> new ResponseEntity<>(personalContact, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/bymatricula{matricula}")
    public ResponseEntity<PersonalContact> getPersonalContactByRegisteredId(@PathVariable("matricula")int registeredId) {
        return personalContactService.getPersonalContactByRegisteredId(registeredId)
                .map(personalContact -> new ResponseEntity<>(personalContact, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/bydni{dni}")
    public ResponseEntity<PersonalContact> getPersonalContactByRegistered(@PathVariable("dni")String dni) {
        return personalContactService.getPersonalContactByRegistered(dni)
                .map(personalContact -> new ResponseEntity<>(personalContact, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<PersonalContact> savePersonalContact(@RequestBody PersonalContact personalContact) {
        return new ResponseEntity<>(personalContactService.savePersonalContact(personalContact), HttpStatus.CREATED);
    }
}
