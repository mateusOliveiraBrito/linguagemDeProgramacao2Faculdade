package exercicio04;

import java.util.Scanner;

public class MesesDoAno {
    public static void main(String[] args) {
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número entre 1 e 12: ");

        try{
            int numero = scanner.nextInt() - 1;

            System.out.println("O mês é: " + meses[numero]);

        }catch (IndexOutOfBoundsException ex){
            System.out.println("O índice informado não corresponde a nenhum mês!");
        }
    }
}
