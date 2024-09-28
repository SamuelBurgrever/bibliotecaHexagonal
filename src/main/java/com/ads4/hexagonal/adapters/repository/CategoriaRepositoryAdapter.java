package com.ads4.hexagonal.adapters.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ads4.hexagonal.adapters.converter.CategoriaConverter;
import com.ads4.hexagonal.adapters.entity.CategoriaEntity;
import com.ads4.hexagonal.core.domain.Categoria;
import com.ads4.hexagonal.core.ports.CategoriaRepositoryPort;

@Component
public class CategoriaRepositoryAdapter implements CategoriaRepositoryPort {

    @Autowired
    CategoriaRepository repository;

    @Autowired
    CategoriaConverter converter;

    @Override
    public Categoria create(Categoria categoria) {
        CategoriaEntity entity = converter.toEntity(categoria);
        return converter.toDomain(repository.save(entity));
    }

    @Override
    public List<Categoria> findAll() {
        List<CategoriaEntity> entities = repository.findAll();
        return entities.stream().map(converter::toDomain).collect(Collectors.toList());
    }
}
