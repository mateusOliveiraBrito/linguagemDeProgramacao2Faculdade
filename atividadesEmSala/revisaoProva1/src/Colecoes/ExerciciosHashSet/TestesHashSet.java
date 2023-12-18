package Colecoes.ExerciciosHashSet;

import Colecoes.ExerciciosHashSet.Models.Pessoa;

import java.util.HashSet;

public class TestesHashSet {
    public static void main(String[] args) {
        HashSet<Pessoa> pessoas = new HashSet<Pessoa>();

        Pessoa pessoa1 = new Pessoa(1, "Mateus");
        Pessoa pessoa2 = new Pessoa(2, "Altair");
        Pessoa pessoa3 = new Pessoa(1, "Mateus");

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println(pessoas);
    }

    private static void testeHashSetSimples() {
        HashSet<String> nomes = new HashSet<String>();
        nomes.add("Altair");
        nomes.add("Mateus");
        nomes.add("Mateus"); //não adiciona
        nomes.add("Mateus"); //não adiciona

        System.out.println(nomes);
    }
}
