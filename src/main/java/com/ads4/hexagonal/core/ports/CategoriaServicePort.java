package com.ads4.hexagonal.core.ports;

import java.util.List;

import com.ads4.hexagonal.core.domain.Categoria;

public interface CategoriaServicePort {

    Categoria registrarCategoria(Categoria categoria);

    List<Categoria> listCategoria();
}
