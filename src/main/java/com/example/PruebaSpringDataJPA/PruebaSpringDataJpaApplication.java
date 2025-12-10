package com.example.PruebaSpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaSpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaSpringDataJpaApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner test(PersonaRepository repo) {
//		return args -> {
//
//			// INSERT
//			repo.save(new Persona("Gonzalo", 46));
//			repo.save(new Persona("Ana", 30));
//
//			// SELECT ALL
//			System.out.println("Personas en BD:");
//			repo.findAll().forEach(p -> System.out.println(p.getId() + " - " + p.getNombre()));
//
//			// SELECT BY ID
//			Persona p = repo.findById(1L).orElse(null);
//			System.out.println("Persona con ID 1: " + (p != null ? p.getNombre() : "no existe"));
//
//			// CONSULTA DERIVADA
//			Persona porNombre = repo.findByNombre("Ana");
//			System.out.println("Buscando Ana → " + porNombre.getEdad());
//		};
//	}
}
