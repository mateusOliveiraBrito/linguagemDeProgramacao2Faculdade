package Recursividade;

import java.util.Scanner;

public class SomaRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um valor:");
        int numero = scanner.nextInt();

        System.out.println(somaRecursiva(numero));
    }

    private static int somaRecursiva(int numero) {
        if (numero == 0) {
            return 0;
        }

        return numero + somaRecursiva(numero - 1);
    }
}
