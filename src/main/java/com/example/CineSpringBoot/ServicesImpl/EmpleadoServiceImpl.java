package com.example.CineSpringBoot.ServicesImpl;

import com.example.CineSpringBoot.entities.Empleado;
import com.example.CineSpringBoot.repositories.BaseRepository;
import com.example.CineSpringBoot.repositories.EmpleadoRepository;
import com.example.CineSpringBoot.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends BaseServiceImpl<Empleado, Long> implements EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public EmpleadoServiceImpl(BaseRepository<Empleado, Long> baseRepository, EmpleadoRepository empleadoRepository) {
        super(baseRepository);
        this.empleadoRepository = empleadoRepository;
    }
}
