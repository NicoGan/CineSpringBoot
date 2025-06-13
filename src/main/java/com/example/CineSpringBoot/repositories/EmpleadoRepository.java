package com.example.CineSpringBoot.repositories;

import com.example.CineSpringBoot.entities.Empleado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado, Long> {
    List<Empleado> findByNombre(String nombre);
    Page<Empleado> findByNombreContaining(String nombre, Pageable pageable);

    boolean existsByDni(String dni);
}
