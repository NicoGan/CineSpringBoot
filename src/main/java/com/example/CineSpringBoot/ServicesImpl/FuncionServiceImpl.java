package com.example.CineSpringBoot.ServicesImpl;

import com.example.CineSpringBoot.entities.Funcion;
import com.example.CineSpringBoot.repositories.BaseRepository;
import com.example.CineSpringBoot.repositories.FuncionRepository;
import com.example.CineSpringBoot.services.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionServiceImpl extends BaseServiceImpl<Funcion, Long> implements FuncionService {
    @Autowired
    private FuncionRepository funcionRepository;

    public FuncionServiceImpl(BaseRepository<Funcion, Long> baseRepository, FuncionRepository funcionRepository) {
        super(baseRepository);
        this.funcionRepository = funcionRepository;
    }
}
