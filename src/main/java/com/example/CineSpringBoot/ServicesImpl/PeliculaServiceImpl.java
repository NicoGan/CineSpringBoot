package com.example.CineSpringBoot.ServicesImpl;

import com.example.CineSpringBoot.entities.Pelicula;
import com.example.CineSpringBoot.repositories.BaseRepository;
import com.example.CineSpringBoot.repositories.PeliculaRepository;
import com.example.CineSpringBoot.services.PeliculaService;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl extends BaseServiceImpl<Pelicula, Long> implements PeliculaService {
    private PeliculaRepository peliculaRepository;

    public PeliculaServiceImpl(BaseRepository<Pelicula, Long> baseRepository, PeliculaRepository peliculaRepository) {
        super(baseRepository);
        this.peliculaRepository = peliculaRepository;
    }
}
