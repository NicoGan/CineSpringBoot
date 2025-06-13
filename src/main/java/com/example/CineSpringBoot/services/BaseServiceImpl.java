package com.example.CineSpringBoot.services;

import com.example.CineSpringBoot.entities.Base;
import com.example.CineSpringBoot.repositories.BaseRepository;

import java.io.Serializable;

public abstract class BaseServiceImpl <E extends Base, ID extends Serializable> implements BaseService<E,ID> {
    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }
}
