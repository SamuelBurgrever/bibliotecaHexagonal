package com.ads4.hexagonal.adapters.converter;

import org.springframework.stereotype.Component;

import com.ads4.hexagonal.adapters.dto.CategoriaDto;
import com.ads4.hexagonal.adapters.entity.CategoriaEntity;
import com.ads4.hexagonal.core.domain.Categoria;

@Component
public class CategoriaConverter {

    public Categoria toDomain(CategoriaDto dto) {
        return new Categoria(dto.getId(), dto.getNome());
    }

    public CategoriaDto toDto(Categoria categoria) {
        return new CategoriaDto(categoria.getId(), categoria.getNome());
    }

    public CategoriaEntity toEntity(Categoria categoria) {
        return new CategoriaEntity(categoria.getId(), categoria.getNome());
    }

    public Categoria toDomain(CategoriaEntity entity) {
        return new Categoria(entity.getId(), entity.getNome());
    }
}
