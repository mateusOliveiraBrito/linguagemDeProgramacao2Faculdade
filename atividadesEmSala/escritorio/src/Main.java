import Models.Assistente;
import Models.Funcionario;
import Models.Gerente;
import Models.Vendedor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECIONE UMA OPÇÃO ABAIXO: ");
        System.out.println("[1] - GERENTE");
        System.out.println("[2] - VENDEDOR");
        System.out.println("[3] - ASSISTENTE");

        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        if (opcao != 1 && opcao != 2 && opcao != 3) {
            System.out.println("Opção inválida! Tente novamente...");
            return;
        }

        System.out.println("");
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.next();

        System.out.println("");
        System.out.print("Digite a matricula do funcionário: ");
        String matricula = scanner.next();

        System.out.println("");
        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        if (opcao == 1) {
            Funcionario gerente = new Gerente(nome, matricula, salarioBase);
            processarFuncionario(gerente);
            return;
        }

        if (opcao == 2) {
            Funcionario vendedor = new Gerente(nome, matricula, salarioBase);
            processarFuncionario(vendedor);
            return;
        }

        if (opcao == 3) {
            Funcionario assistente = new Gerente(nome, matricula, salarioBase);
            processarFuncionario(assistente);
            return;
        }
    }

    private static void processarFuncionario(Funcionario funcionario) {
        var sb = new StringBuilder();
        sb.append("==========FOLHA SALARIAL==========\n");
        sb.append("Nome: " + funcionario.getNome() + "\n");
        sb.append("Matrícula: " + funcionario.getMatricula() + "\n");
        sb.append("Salário: " + funcionario.calcularSalario() + "\n");

        System.out.println(sb.toString());
    }
}