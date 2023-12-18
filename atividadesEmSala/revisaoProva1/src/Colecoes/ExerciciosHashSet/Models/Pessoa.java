package Colecoes.ExerciciosHashSet.Models;

import java.util.Objects;

public class Pessoa {
    private int codigo;
    private String nome;

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return codigo == pessoa.codigo && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome);
    }

    @Override
    public String toString() {
        return this.codigo + " | " + this.nome;
    }
}