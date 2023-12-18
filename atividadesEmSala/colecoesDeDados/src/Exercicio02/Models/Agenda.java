package Exercicio02.Models;

public class Agenda {
    private Pessoa[] pessoas;

    public Agenda() {
        pessoas = new Pessoa[10];
    }

    public void armazenarPessoa(String nome, int idade, float altura) {
        if (pessoas.length == 10) {
            System.out.println("A lista de pessoas já está cheia!");
            return;
        }

        Pessoa newPessoa = new Pessoa(nome, idade, altura);
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                pessoas[i] = newPessoa;
                break;
            }
        }
    }

    public void removePessoa(String nome) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getNome().equals(nome)) {
                pessoas[i] = null;
            }
        }
    }

    public int buscaPessoa(String nome) {
        int posicao = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getNome().equals(nome)) {
                posicao = i;
            }
        }

        return posicao;
    }

    public void imprimeAgenda(){
        System.out.println("Dados da agenda: ");
    }
}
