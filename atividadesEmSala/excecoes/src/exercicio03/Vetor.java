package exercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;

        try {
            for(;;){
                System.out.println("Informe um número: ");
                var numero = scanner.nextInt();

                if (numero == 0) {
                    numeros[contador] = numero;
                    break;
                }

                numeros[contador] = numero;
                contador++;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Informe 10 números ou menos!");
        } catch (InputMismatchException ex) {
            System.out.println("Informe um valor numérico!");
        } finally {
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }
        }
    }
}
