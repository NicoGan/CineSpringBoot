package com.example.CineSpringBoot.ServicesImpl;

import com.example.CineSpringBoot.entities.Sala;
import com.example.CineSpringBoot.repositories.BaseRepository;
import com.example.CineSpringBoot.repositories.SalaRepository;
import com.example.CineSpringBoot.services.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaServiceImpl extends BaseServiceImpl<Sala, Long> implements SalaService {
    @Autowired
    private SalaRepository salaRepository;

    public SalaServiceImpl(BaseRepository<Sala, Long> baseRepository, SalaRepository salaRepository) {
        super(baseRepository);
        this.salaRepository = salaRepository;
    }
}
