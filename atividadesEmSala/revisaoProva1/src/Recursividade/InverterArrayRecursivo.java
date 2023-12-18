package Recursividade;

import java.util.Arrays;

public class InverterArrayRecursivo {
    public static void main(String[] args) {
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        inverterArray(numeros, 0, numeros.length - 1);

        System.out.println(Arrays.toString(numeros));
    }

    public static void inverterArray(int[] numeros, int posicaoInicial, int posicaoFinal) {
        if (posicaoInicial >= posicaoFinal) {
            return;
        }

        int numero = numeros[posicaoInicial];
        numeros[posicaoInicial] = numeros[posicaoFinal];
        numeros[posicaoFinal] = numero;

        inverterArray(numeros, posicaoInicial + 1, posicaoFinal - 1);
    }
}
