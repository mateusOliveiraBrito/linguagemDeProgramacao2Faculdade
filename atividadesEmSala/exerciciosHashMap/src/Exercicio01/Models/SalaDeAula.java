package Exercicio01.Models;

import java.util.HashMap;
import java.util.Map;

public class SalaDeAula {
    private HashMap<Integer, Aluno> alunos;

    public SalaDeAula() {
        alunos = new HashMap<Integer, Aluno>();
        alunos.put(001, new Aluno(001, "Mateus"));
        alunos.put(002, new Aluno(002, "Altair"));
        alunos.put(003, new Aluno(003, "Luana"));
    }

    public Aluno buscaAlunoPorMatricula(int matricula) {
        return alunos.get(matricula);
    }

    public void imprimeTodosOsAlunos() {
        for (Map.Entry<Integer, Aluno> keyValuePair : alunos.entrySet()) {
            System.out.println(keyValuePair.getValue().toString());
        }
    }
}