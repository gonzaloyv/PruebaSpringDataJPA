package com.example.PruebaSpringDataJPA.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PruebaSpringDataJPA.entities.Persona;
import com.example.PruebaSpringDataJPA.repositories.PersonaRepository;

@RestController 
@RequestMapping("/api/personas") 
public class PersonaController { 
 
    private final PersonaRepository repo; 
 
    public PersonaController(PersonaRepository repo) { 
        this.repo = repo; 
    } 
    //
    // 					GET
    //
    @GetMapping 
    public List<Persona> getAll() { 
        return repo.findAll(); 
    }
    
    @GetMapping("/{id}") 
    public Persona getById(@PathVariable Long id) { 
        return repo.findById(id).orElse(null); 
    } 
    //
    // 					POST
    //
    @PostMapping
    public Persona create(@RequestBody Persona persona) { 
        return repo.save(persona); 
    }
    //
    // 					PUT
    //
    @PutMapping("/{id}")
    public Persona actualizar(
    		@PathVariable Long id,
    		@RequestBody Persona personaActualizada) {
    	
    	Persona p = repo.findById(id).orElseThrow();
    	
    	p.setNombre(personaActualizada.getNombre());
    	p.setEdad(personaActualizada.getEdad());
    	
    	return repo.save(p);
    }
    //
    // 					DELETE
    //
    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id) {
    	repo.deleteById(id);
    }
} 

