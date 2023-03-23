package Models;

import java.io.Serializable;

public class EventoDeAgenda implements Serializable {
    private String codigo, nome;
    private Data data;

    public EventoDeAgenda(String codigo, String nome, Data data) {
        this.codigo = codigo;
        this.nome = nome;
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Data getData() {
        return data;
    }

    @Override
    public String toString() {
        return "CODIGO: " + codigo + " | NOME: " + nome + " | " + data.toString();
    }
}