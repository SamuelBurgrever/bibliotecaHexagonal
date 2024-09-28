package com.ads4.hexagonal.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ads4.hexagonal.core.domain.Usuario;
import com.ads4.hexagonal.core.ports.UsuarioRepositoryPort;
import com.ads4.hexagonal.core.ports.UsuarioServicePort;

public class UsuarioService implements UsuarioServicePort {

    @Autowired
    UsuarioRepositoryPort repositoryPort;

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return repositoryPort.create(usuario);
    }

    @Override
    public List<Usuario> listUsuario(){
        return repositoryPort.findAll();
    }

}
