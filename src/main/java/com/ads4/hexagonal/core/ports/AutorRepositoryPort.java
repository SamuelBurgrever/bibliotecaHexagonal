package com.ads4.hexagonal.core.ports;

import java.util.List;

import com.ads4.hexagonal.core.domain.Autor;

public interface AutorRepositoryPort {

    Autor create(Autor autor);

    List<Autor> findAll();
}
