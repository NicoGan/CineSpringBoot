package com.example.CineSpringBoot.ServicesImpl;

import com.example.CineSpringBoot.entities.Pago;
import com.example.CineSpringBoot.repositories.BaseRepository;
import com.example.CineSpringBoot.repositories.PagoRepository;
import com.example.CineSpringBoot.services.PagoService;
import org.springframework.stereotype.Service;

@Service
public class PagoServiceImpl extends BaseServiceImpl<Pago, Long> implements PagoService {
    private PagoRepository pagoRepository;

    public PagoServiceImpl(BaseRepository<Pago, Long> baseRepository, PagoRepository pagoRepository) {
        super(baseRepository);
        this.pagoRepository = pagoRepository;
    }
}
