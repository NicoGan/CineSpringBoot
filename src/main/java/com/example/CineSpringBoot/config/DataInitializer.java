package com.example.CineSpringBoot.config;

import com.example.CineSpringBoot.entities.*;
import com.example.CineSpringBoot.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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
            // Crear y guardar salas
            Sala sala1 = new Sala();
            sala1.setNumero(1);
            sala1.setCapacidad(100);

            Sala sala2 = new Sala();
            sala2.setNumero(2);
            sala2.setCapacidad(80);

            salaRepository.saveAll(Arrays.asList(sala1, sala2));

            // Crear y guardar películas
            Pelicula peli1 = new Pelicula("Matrix", Genero.ACCION);
            Pelicula peli2 = new Pelicula("Toy Story", Genero.ANIMAC);
            Pelicula peli3 = new Pelicula("El Padrino", Genero.DRAMA);

            peliculaRepository.saveAll(Arrays.asList(peli1, peli2, peli3));

            // Recuperar entidades gestionadas por JPA
            var salas = salaRepository.findAll();
            var peliculas = peliculaRepository.findAll();

            // Crear y guardar funciones
            Funcion funcion1 = new Funcion();
            funcion1.setHorario("18:00");
            funcion1.setPelicula(peliculas.get(0));
            funcion1.setSala(salas.get(0));

            Funcion funcion2 = new Funcion();
            funcion2.setHorario("20:00");
            funcion2.setPelicula(peliculas.get(1));
            funcion2.setSala(salas.get(1));

            Funcion funcion3 = new Funcion();
            funcion3.setHorario("22:00");
            funcion3.setPelicula(peliculas.get(2));
            funcion3.setSala(salas.get(0));

            funcionRepository.saveAll(Arrays.asList(funcion1, funcion2, funcion3));

            // Crear cine y asociar salas y películas gestionadas
            Cine cine = new Cine();
            cine.setNombre("Cine Central");
            cine.setDireccion("Mendoza Plaza Shopping");
            cine.setSalas(salas);
            cine.setPeliculas(peliculas);
            cineRepository.save(cine);
        }
    }
}
