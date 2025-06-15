package com.example.CineSpringBoot.config;

import com.example.CineSpringBoot.entities.Pelicula;
import com.example.CineSpringBoot.repositories.PeliculaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final PeliculaRepository peliculaRepository;

    public DataInitializer(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    @Override
    public void run(String... args) {
        if (peliculaRepository.count() == 0) {
            peliculaRepository.save(new Pelicula("Matrix", com.example.CineSpringBoot.entities.Genero.ACCION));
            peliculaRepository.save(new Pelicula("Toy Story", com.example.CineSpringBoot.entities.Genero.ANIMAC));
            peliculaRepository.save(new Pelicula("El Padrino", com.example.CineSpringBoot.entities.Genero.DRAMA));
            // Agrega más películas según tu modelo y enum Genero
        }
    }
}
