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

import com.ads4.hexagonal.adapters.converter.CategoriaConverter;
import com.ads4.hexagonal.adapters.dto.CategoriaDto;
import com.ads4.hexagonal.core.ports.CategoriaServicePort;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaServicePort categoriaServicePort;

    @Autowired
    CategoriaConverter categoriaConverter;

    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public CategoriaDto create(@RequestBody CategoriaDto categoriaDto) {
        return categoriaConverter.toDto(categoriaServicePort.registrarCategoria(categoriaConverter.toDomain(categoriaDto)));
    }

    @GetMapping("/listar")
    public List<CategoriaDto> listAll() {
        return categoriaServicePort.listCategoria().stream().map(categoriaConverter::toDto).collect(Collectors.toList());
    }
}
