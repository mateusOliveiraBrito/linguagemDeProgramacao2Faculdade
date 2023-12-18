package Exercicio01;

import Exercicio01.Models.Aluno;
import Exercicio01.Models.SalaDeAula;

public class Testes {
    public static void main(String[] args) {
        SalaDeAula sala = new SalaDeAula();

        System.out.println("Recuperando aluno pela matrícula...");
        Aluno aluno01 = sala.buscaAlunoPorMatricula(001);
        Aluno aluno02 = sala.buscaAlunoPorMatricula(002);
        Aluno aluno03 = sala.buscaAlunoPorMatricula(003);

        System.out.println();
        System.out.println("ALUNO 01: " + aluno01.toString());
        System.out.println("ALUNO 02: " + aluno02.toString());
        System.out.println("ALUNO 03: " + aluno03.toString());

        System.out.println();
        System.out.println("Imprimindo todos os itens da coleção...");
        sala.imprimeTodosOsAlunos();
    }
}