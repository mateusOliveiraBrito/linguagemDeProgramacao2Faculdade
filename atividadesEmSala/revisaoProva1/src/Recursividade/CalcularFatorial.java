package Recursividade;

import java.util.Scanner;

public class CalcularFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        System.out.println("FATORIAL DE " + numero + " = " + calcularFatorial(numero));
    }

    private static int calcularFatorial(int numero) {
        if (numero == 0) {
            return 1;
        }

        return numero * calcularFatorial(numero - 1);
    }
}
