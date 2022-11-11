package com.colegiofisiokin.matriculados.web.controller;

import com.colegiofisiokin.matriculados.domain.Registered;
import com.colegiofisiokin.matriculados.domain.service.RegisteredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/matriculados")
public class RegisteredController {

    @Autowired
    private RegisteredService registeredService;

    @GetMapping("/all")
    public ResponseEntity<List<Registered>> getAllRegistered(){
        return registeredService.getAllRegistered()
                .map(registereds -> new ResponseEntity<>(registereds, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/bymatricula{matricula}")
    public ResponseEntity<Registered> getRegisteredById(@PathVariable("matricula") int registeredId) {
        return new ResponseEntity<>(registeredService.getRegisteredById(registeredId), HttpStatus.OK);
    }

    @GetMapping("/bydni{dni}")
    public ResponseEntity<Registered> getByDni(@PathVariable("dni")String dni) {
        return registeredService.getByDni(dni)
                .map(registered -> new ResponseEntity<>(registered, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Registered> saveRegistered(@RequestBody Registered registered) {
        return new ResponseEntity<>(registeredService.saveRegistered(registered), HttpStatus.CREATED) ;
    }
}
