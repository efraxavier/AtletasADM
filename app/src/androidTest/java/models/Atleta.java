// Atleta.java
package com.example.natacao.models;

public abstract class Atleta {
    private String nome;
    private String dataNascimento;
    private String bairro;

    // Construtor, getters e setters
    public Atleta(String nome, String dataNascimento, String bairro) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getBairro() {
        return bairro;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData de Nascimento: " + dataNascimento + "\nBairro: " + bairro;
    }
}
