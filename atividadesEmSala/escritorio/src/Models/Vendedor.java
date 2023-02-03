package Models;

public class Vendedor extends Funcionario {

    private double _comissao;

    public Vendedor(String nome, String matricula, double salario_base, double comissao) {
        super(nome, matricula, salario_base);

        _comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + _comissao;
    }
}