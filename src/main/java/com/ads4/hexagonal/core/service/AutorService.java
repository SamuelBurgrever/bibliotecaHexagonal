package com.ads4.hexagonal.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ads4.hexagonal.core.domain.Autor;
import com.ads4.hexagonal.core.ports.AutorRepositoryPort;
import com.ads4.hexagonal.core.ports.AutorServicePort;

public class AutorService implements AutorServicePort {

    @Autowired
    AutorRepositoryPort repositoryPort;

    @Override
    public Autor createAutor(Autor autor) {
        return autor;
    }

    @Override
    public List<Autor> listAutor() {
        return repositoryPort.findAll();

    }

}
