package com.ads4.hexagonal.adapters.entities;

import java.util.List;

import com.ads4.hexagonal.core.domain.Emprestimo;
import com.ads4.hexagonal.core.domain.Reserva;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario")

public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String dataNascimento;

    @JsonIgnore
    @OneToMany(mappedBy = "usuario_reserva")
    private List<Reserva> reservas;

    @JsonIgnore
    @OneToMany(mappedBy = "usuario_emprestimo")
    private List<Emprestimo> emprestimos;

    public UsuarioEntity() {
    }

    public UsuarioEntity(int id, String nome, String email, String senha, String cpf, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }




}
