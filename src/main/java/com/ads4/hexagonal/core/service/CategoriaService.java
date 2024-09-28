package com.ads4.hexagonal.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ads4.hexagonal.core.domain.Categoria;
import com.ads4.hexagonal.core.ports.CategoriaRepositoryPort;
import com.ads4.hexagonal.core.ports.CategoriaServicePort;

public class CategoriaService implements CategoriaServicePort {

    @Autowired // autorizar o metodo dentro da classe
    CategoriaRepositoryPort repositoryPort;
    
    @Override
    public Categoria registrarCategoria(Categoria categoria) {
        return repositoryPort.create(categoria);
    }

    @Override
    public List<Categoria> listCategoria() {
        return repositoryPort.findAll();

    }
}
