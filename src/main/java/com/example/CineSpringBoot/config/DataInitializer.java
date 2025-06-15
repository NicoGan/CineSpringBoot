package com.example.CineSpringBoot.config;

import com.example.CineSpringBoot.entities.*;
import com.example.CineSpringBoot.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;

@Component
public class DataInitializer implements CommandLineRunner {

    private final CineRepository cineRepository;
    private final SalaRepository salaRepository;
    private final PeliculaRepository peliculaRepository;
    private final FuncionRepository funcionRepository;

    public DataInitializer(
            CineRepository cineRepository,
            SalaRepository salaRepository,
            PeliculaRepository peliculaRepository,
            FuncionRepository funcionRepository
    ) {
        this.cineRepository = cineRepository;
        this.salaRepository = salaRepository;
        this.peliculaRepository = peliculaRepository;
        this.funcionRepository = funcionRepository;
    }

    @Override
    public void run(String... args) {
        if (cineRepository.count() == 0) {
            // Crear Cine
            Cine cine = new Cine();
            cine.setNombre("Cinepolis");
            cine.setDireccion("Mendoza Plaza Shopping");

            // Crear Películas
            Pelicula peli1 = new Pelicula("Matrix", Genero.ACCION);
            Pelicula peli2 = new Pelicula("Toy Story", Genero.ANIMAC);
            Pelicula peli3 = new Pelicula("El Padrino", Genero.DRAMA);

            // Crear Salas
            Sala sala1 = new Sala();
            sala1.setNumero(1);
            sala1.setCapacidad(100);

            Sala sala2 = new Sala();
            sala2.setNumero(2);
            sala2.setCapacidad(80);

            
            cine.setPeliculas(Arrays.asList(peli1, peli2, peli3));
            cine.setSalas(Arrays.asList(sala1, sala2));

            cineRepository.save(cine);

            Funcion funcion1 = new Funcion();
            funcion1.setHorario("18:00");
            funcion1.setPelicula(peli1);
            funcion1.setSala(sala1);

            Funcion funcion2 = new Funcion();
            funcion2.setHorario("20:00");
            funcion2.setPelicula(peli2);
            funcion2.setSala(sala2);

            Funcion funcion3 = new Funcion();
            funcion3.setHorario("22:00");
            funcion3.setPelicula(peli3);
            funcion3.setSala(sala1);

            funcionRepository.saveAll(Arrays.asList(funcion1, funcion2, funcion3));
        }
    }
}
