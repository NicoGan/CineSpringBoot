package com.example.CineSpringBoot.repositories;

import com.example.CineSpringBoot.entities.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClienteRepository extends BaseRepository<Cliente, Long>{

    List<Cliente> findByNombreContaining(String nombre);
    Page<Cliente> findByNombreContaining(String nombre, Pageable pageable);
    boolean existsByNombre(String nombre);
    Cliente findByEmail(String email);

}
