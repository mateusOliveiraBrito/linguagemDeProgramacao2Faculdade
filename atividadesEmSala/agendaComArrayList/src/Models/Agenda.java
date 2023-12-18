package Models;

import Models.Contracts.IAgenda;

import java.io.Serializable;
import java.util.ArrayList;

public class Agenda implements IAgenda, Serializable {
    private ArrayList<Pessoa> pessoas;

    public Agenda() {
        pessoas = new ArrayList<Pessoa>();
    }

    @Override
    public void armazenaPessoa(String nome, int idade, float altura) {
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        pessoas.add(pessoa);
    }

    @Override
    public void removePessoa(String nome) {
        pessoas.remove(new Pessoa(nome));
    }

    @Override
    public int buscaPessoa(String nome) {
        int index = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                index = pessoas.indexOf(pessoa);
                break;
            }
        }

        return index;
    }

    @Override
    public void imprimeAgenda() {
        System.out.println("====AGENDA COMPLETA:====");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
            System.out.println("---------------------------------------------");
        }
    }

    @Override
    public void imprimePessoa(int index) {
        Pessoa pessoa = pessoas.get(index);
        System.out.println("====DADOS DA PESSOA:===\n");
        System.out.println(pessoa.toString());
    }
}