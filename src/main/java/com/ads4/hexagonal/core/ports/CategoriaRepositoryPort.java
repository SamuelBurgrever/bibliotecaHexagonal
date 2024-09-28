package com.ads4.hexagonal.core.ports;

import java.util.List;

import com.ads4.hexagonal.core.domain.Categoria;

public interface  CategoriaRepositoryPort {
    
    Categoria create(Categoria categoria);

    List<Categoria> findAll();
}
