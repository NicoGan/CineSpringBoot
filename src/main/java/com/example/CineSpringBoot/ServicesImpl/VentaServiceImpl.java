package com.example.CineSpringBoot.ServicesImpl;

import com.example.CineSpringBoot.entities.Venta;
import com.example.CineSpringBoot.repositories.BaseRepository;
import com.example.CineSpringBoot.repositories.VentaRepository;
import com.example.CineSpringBoot.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImpl extends BaseServiceImpl<Venta, Long> implements VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    public VentaServiceImpl(BaseRepository<Venta, Long> baseRepository, VentaRepository ventaRepository) {
        super(baseRepository);
        this.ventaRepository = ventaRepository;
    }
}
