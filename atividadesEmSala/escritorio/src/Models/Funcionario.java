package Models;

public abstract class Funcionario {

    private String _nome;
    private String _matricula;
    private double _salario_base;

    public Funcionario(String nome, String matricula, double salario_base) {
        _nome = nome;
        _matricula = matricula;
        _salario_base = salario_base;
    }

    public String getNome() {
        return _nome;
    }

    public String getMatricula() {
        return _matricula;
    }

    public double getSalarioBase() {
        return _salario_base;
    }

    public abstract double calcularSalario();
}