package com.example.CineSpringBoot.ServicesImpl;

import com.example.CineSpringBoot.entities.Cine;
import com.example.CineSpringBoot.repositories.BaseRepository;
import com.example.CineSpringBoot.repositories.CineRepository;
import com.example.CineSpringBoot.services.CineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CineServiceImpl extends BaseServiceImpl<Cine, Integer> implements CineService {
    @Autowired
    private CineRepository cineRepository;

    public CineServiceImpl(BaseRepository<Cine, Integer> baseRepository, CineRepository cineRepository) {
        super(baseRepository);
        this.cineRepository = cineRepository;
    }


}
