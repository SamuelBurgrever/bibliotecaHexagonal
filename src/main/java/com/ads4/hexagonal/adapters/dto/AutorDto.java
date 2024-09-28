package com.ads4.hexagonal.adapters.dto;

public class AutorDto {
    private int id;
    private String nome;

    public AutorDto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public AutorDto() {
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

}
