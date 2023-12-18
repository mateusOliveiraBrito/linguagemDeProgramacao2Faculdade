package exercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoDeDoisNumeros {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.println("");

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            double divisao = numero1 / numero2;

            System.out.println("A divisão é: " + divisao);

        } catch (ArithmeticException ex) {
            System.out.println("Não é possível realizar divisão por zero!");
        } catch (InputMismatchException ex) {
            System.out.println("Por favor, insira um valor numérico!");
        }
    }
}
