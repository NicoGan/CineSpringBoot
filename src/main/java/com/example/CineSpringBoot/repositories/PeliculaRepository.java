package com.example.CineSpringBoot.repositories;

import com.example.CineSpringBoot.entities.Pelicula;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends BaseRepository<Pelicula, Long> {
}
