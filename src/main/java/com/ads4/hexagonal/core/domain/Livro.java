package com.ads4.hexagonal.core.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "livro_emprestimo")
    private List<Emprestimo> emprestimos;

    @JsonIgnore
    @OneToMany(mappedBy = "livro_reserva")
    private List<Reserva> reservas;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Autor autor_livro;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Categoria categoria_livro;

    public Livro() {
    }

    public Livro(int id, String nome, List<Emprestimo> emprestimos, List<Reserva> reservas, Autor autor_livro,
            Categoria categoria_livro) {
        this.id = id;
        this.nome = nome;
        this.emprestimos = emprestimos;
        this.reservas = reservas;
        this.autor_livro = autor_livro;
        this.categoria_livro = categoria_livro;
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

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Autor getAutor_livro() {
        return autor_livro;
    }

    public void setAutor_livro(Autor autor_livro) {
        this.autor_livro = autor_livro;
    }

    public Categoria getCategoria_livro() {
        return categoria_livro;
    }

    public void setCategoria_livro(Categoria categoria_livro) {
        this.categoria_livro = categoria_livro;
    }

}
