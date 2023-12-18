package Exercicio01;

import Exercicio01.Models.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        for (; ; ) {
            System.out.print("Informe o id do cliente: ");
            int id = scanner.nextInt();

            if (id < 0) {
                break;
            }

            System.out.print("\nInforme o nome do cliente: ");
            String nome = scanner.next();

            System.out.print("\nInforme a idade do cliente: ");
            int idade = scanner.nextInt();

            System.out.print("\nInforme o telefone: ");
            String telefone = scanner.next();

            clientes.add(new Cliente(id, nome, idade, telefone));
        }

        System.out.println("====== CLIENTES: ======");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }
}
