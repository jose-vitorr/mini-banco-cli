package br.com.josevitor.minibanco.modelo;

import java.util.Objects;

public class Cliente {
    private final int id;
    private String nome;
    private final String cpf;

    public Cliente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.cpf = Objects.requireNonNull(cpf, "CPF pode ser nulo");
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }

    public void setNome(String nome) {
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo");
    }
}
