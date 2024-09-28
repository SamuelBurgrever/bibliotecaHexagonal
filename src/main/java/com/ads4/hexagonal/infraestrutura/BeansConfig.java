package com.ads4.hexagonal.infraestrutura;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ads4.hexagonal.core.ports.AutorServicePort;
import com.ads4.hexagonal.core.ports.UsuarioServicePort;
import com.ads4.hexagonal.core.service.AutorService;
import com.ads4.hexagonal.core.service.UsuarioService;

@Configuration
public class BeansConfig {

    @Bean
    public UsuarioServicePort usuarioServicePortImpl() {
        return new UsuarioService();
    }

    @Bean
    public AutorServicePort autorServicePortImpl() {
        return new AutorService();
    }
}
