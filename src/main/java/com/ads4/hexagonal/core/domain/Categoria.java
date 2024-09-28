package com.ads4.hexagonal.core.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Categoria {
    
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private String nome;

@JsonIgnore
@OneToMany(mappedBy = "categoria_livro")
private List<Livro> livros;

public Categoria() {
}

public Categoria(int id, String nome) {
    this.id = id;
    this.nome = nome;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public List<Livro> getLivros() {
    return livros;
}

public void setLivros(List<Livro> livros) {
    this.livros = livros;
}




}
