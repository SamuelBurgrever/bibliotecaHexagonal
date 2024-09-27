package com.ads4.hexagonal.adapters.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ads4.hexagonal.adapters.converter.AutorConverter;
import com.ads4.hexagonal.adapters.dto.AutorDto;
import com.ads4.hexagonal.core.ports.AutorServicePort;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    AutorServicePort autorServicePort;

    @Autowired
    AutorConverter autorConverter;

    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public AutorDto create(@RequestBody AutorDto autorDto) {
        return autorConverter.toDto(autorServicePort.createAutor(autorConverter.toDomain(autorDto)));

    }

    @GetMapping("/listar")
    public List<AutorDto> listAll() {
        return autorServicePort.listAutor().stream().map(autorConverter::toDto).collect(Collectors.toList());
    }

}