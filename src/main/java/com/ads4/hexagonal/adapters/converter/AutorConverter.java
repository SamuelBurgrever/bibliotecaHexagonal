package com.ads4.hexagonal.adapters.converter;

import org.springframework.stereotype.Component;

import com.ads4.hexagonal.adapters.dto.AutorDto;
import com.ads4.hexagonal.adapters.entites.AutorEntity;
import com.ads4.hexagonal.core.domain.Autor;

@Component
public class AutorConverter {

    public Autor toDomain(AutorDto dto) {
        return new Autor(dto.getId(), dto.getNome());
    }

    public AutorDto toDto(Autor autor) {
        return new AutorDto(autor.getId(), autor.getNome());
    }

    public AutorEntity toEntity(Autor autor) {
        return new AutorEntity(autor.getId(), autor.getNome());
    }

    public Autor toDomain(AutorEntity entity) {
        return new Autor(entity.getId(), entity.getNome());
    }

}
