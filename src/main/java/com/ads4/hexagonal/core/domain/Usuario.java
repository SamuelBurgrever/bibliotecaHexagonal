package com.ads4.hexagonal.core.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.OneToMany;

public class Usuario {

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

    public Usuario() {
    }

    public Usuario(int id, String nome, String email, String senha, String cpf, String dataNascimento,
            List<Reserva> reservas, List<Emprestimo> emprestimos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.reservas = reservas;
        this.emprestimos = emprestimos;
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

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

}
