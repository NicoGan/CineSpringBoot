package com.example.CineSpringBoot.repositories;

import com.example.CineSpringBoot.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends BaseRepository<Venta, Long> {
}
