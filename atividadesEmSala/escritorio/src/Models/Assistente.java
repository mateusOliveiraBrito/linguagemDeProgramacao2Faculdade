package Models;

public class Assistente extends Funcionario {

    public Assistente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
}