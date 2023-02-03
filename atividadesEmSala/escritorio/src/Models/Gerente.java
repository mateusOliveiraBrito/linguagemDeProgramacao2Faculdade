package Models;

public class Gerente extends Funcionario {

    public Gerente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }

    @Override
    public double calcularSalario() {
        return 2 * getSalarioBase();
    }
}