package Recursividade;

import java.util.Scanner;

public class SomaDeFracoesRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        int numero = scanner.nextInt();

        System.out.println((double)somarFracoesRecursivas(numero));
    }

    private static double somarFracoesRecursivas(int numero) {
        if (numero - 1 > 0) {
            return (1.0 / numero) + somarFracoesRecursivas(numero - 1);
        }

        return 1.0 / numero;
    }
}
