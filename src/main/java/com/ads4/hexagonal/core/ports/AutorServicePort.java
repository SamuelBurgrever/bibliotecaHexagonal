package com.ads4.hexagonal.core.ports;

import com.ads4.hexagonal.core.domain.Autor;

public interface AutorServicePort {

    Autor createAutor(Autor autor);

}
