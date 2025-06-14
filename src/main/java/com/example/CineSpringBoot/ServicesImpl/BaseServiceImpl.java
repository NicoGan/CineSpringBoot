package com.example.CineSpringBoot.ServicesImpl;

import com.example.CineSpringBoot.entities.Base;
import com.example.CineSpringBoot.entities.Cine;
import com.example.CineSpringBoot.repositories.BaseRepository;
import com.example.CineSpringBoot.services.BaseService;
import jakarta.transaction.Transactional;

import java.beans.Transient;
import java.io.Serializable;
import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl <E extends Base, ID extends Serializable> implements BaseService<E,ID> {
    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try{
            return baseRepository.findAll();
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entity = baseRepository.findById(id);
            return entity.orElse(null);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            return baseRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            if (baseRepository.existsById(id)) {
                entity.setId((Long) id);
                return baseRepository.save(entity);
            } else {
                throw new Exception("Entidad no encontrada");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
