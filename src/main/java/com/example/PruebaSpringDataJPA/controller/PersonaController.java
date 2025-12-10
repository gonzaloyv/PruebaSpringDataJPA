package com.example.PruebaSpringDataJPA.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PruebaSpringDataJPA.entities.Persona;
import com.example.PruebaSpringDataJPA.repositories.PersonaRepository;

@RestController 
@RequestMapping("/personas") 
public class PersonaController { 
 
    private final PersonaRepository repo; 
 
    public PersonaController(PersonaRepository repo) { 
        this.repo = repo; 
    } 
 
    @GetMapping 
    public List<Persona> getAll() { 
        return repo.findAll(); 
    } 
 
    @PostMapping 
    public Persona create(@RequestBody Persona persona) { 
        return repo.save(persona); 
    } 
 
    @GetMapping("/{id}") 
    public Persona getById(@PathVariable Long id) { 
        return repo.findById(id).orElse(null); 
    } 
} 

