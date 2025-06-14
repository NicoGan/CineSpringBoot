package com.example.CineSpringBoot.repositories;

import com.example.CineSpringBoot.entities.Cine;
import org.springframework.stereotype.Repository;

@Repository
public interface CineRepository extends BaseRepository<Cine, Integer> {
}
