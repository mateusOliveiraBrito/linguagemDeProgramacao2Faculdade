package Recursividade;

import java.util.Scanner;

public class PotenciaRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base:");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente:");
        int expoente = scanner.nextInt();

        System.out.println(potenciaRecursiva(base, expoente));
    }

    private static int potenciaRecursiva(int base, int expoente) {

        if (expoente == 0) {
            return 1;
        }

        return base * potenciaRecursiva(base, expoente - 1);
    }
}
