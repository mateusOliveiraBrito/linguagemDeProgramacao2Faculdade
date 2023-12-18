package Exercicio01.Models;

public class EventoDeAgenda {
    private int codigo;
    private String nome;
    private Data data;

    public EventoDeAgenda(int codigo, String nome, Data data){
        this.codigo = codigo;
        this.nome = nome;
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Data getData() {
        return data;
    }
}