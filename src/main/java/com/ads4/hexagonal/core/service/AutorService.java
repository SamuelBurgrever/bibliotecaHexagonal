package com.ads4.hexagonal.core.service;

import com.ads4.hexagonal.core.domain.Autor;
import com.ads4.hexagonal.core.ports.AutorServicePort;

public class AutorService implements AutorServicePort {

    @Override
    public Autor createAutor(Autor autor) {
        return autor;
    }

}
