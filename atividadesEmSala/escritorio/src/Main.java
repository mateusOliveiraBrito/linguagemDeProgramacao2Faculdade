import Models.Assistente;
import Models.Funcionario;
import Models.Gerente;
import Models.Vendedor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();

        var gerente = new Gerente("Pedro", "123456789", 3000);
        var assistente = new Assistente("Carlos", "987654321", 1500);
        var vendedor = new Vendedor("Márcio", "56457889", 1500, 300);

        funcionarios.add(gerente);
        funcionarios.add(assistente);
        funcionarios.add(vendedor);

        for (var funcionario : funcionarios) {

            var sb = new StringBuilder();
            sb.append("==========FOLHA SALARIAL==========\n");
            sb.append("Nome: " + funcionario.getNome() + "\n");
            sb.append("Matrícula: " + funcionario.getMatricula() + "\n");
            sb.append("Salário: " + funcionario.calcularSalario() + "\n");

            System.out.println(sb.toString());
        }
    }
}