package com.ads4.hexagonal.adapters.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ads4.hexagonal.adapters.converter.UsuarioConverter;
import com.ads4.hexagonal.adapters.entities.UsuarioEntity;
import com.ads4.hexagonal.core.domain.Usuario;
import com.ads4.hexagonal.core.ports.UsuarioRepositoryPort;

@Component
public class UsuarioRepositoryAdapters implements UsuarioRepositoryPort {
    
    @Autowired
    UsuarioRepository repository;

    @Autowired
    UsuarioConverter converter;

    @Override

    public Usuario create(Usuario usuario){
        UsuarioEntity entity = converter.toEntity(usuario);
        return converter.toDomain(repository.save(entity));
    }

    @Override
    public List<Usuario> findAll(){
        List<UsuarioEntity> entities = repository.findAll();
        return entities.stream().map(converter::toDomain).collect(Collectors.toList());
    }

}
