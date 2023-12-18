package Exercicio01.Models;

public class Aluno {
    private int matricula;
    private String nome;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "MATRÍCULA: " + getMatricula() + " | NOME: " + getNome();
    }
}