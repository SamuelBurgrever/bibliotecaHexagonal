package com.ads4.hexagonal.adapters.converter;

import org.springframework.stereotype.Component;

import com.ads4.hexagonal.adapters.dto.UsuarioDto;
import com.ads4.hexagonal.adapters.entities.UsuarioEntity;
import com.ads4.hexagonal.core.domain.Usuario;

@Component
public class UsuarioConverter {


    public Usuario toDomain(UsuarioDto dto) {
    return new Usuario(dto.getId(), dto.getNome(), dto.getEmail());
    }

    public Usuario toDomain(UsuarioDto dto) {
        return new Usuario(dto.getId(), dto.getNome(), dto.getEmail(), dto.getSenha(), dto.getCpf(), dto.getDataNascimento());
    }


    public UsuarioDto toDto(Usuario usuario) {
        return new UsuarioDto(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getCpf(), usuario.getCpf(), usuario.getSenha());
    }

    public UsuarioEntity toEntity(Usuario usuario){
        return new UsuarioEntity(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getCpf(), usuario.getDataNascimento(), usuario.getSenha());
    }

    public Usuario toDomain(UsuarioEntity entity){
        return new Usuario(entity.getId(), entity.getNome(), entity.getEmail(), entity.getSenha(), entity.getCpf(), entity.getDataNascimento());
    }
    
}
