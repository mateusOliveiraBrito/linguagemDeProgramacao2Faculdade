package Exercicios03E04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 100. \nPara encerrar a execução digite um valor fora do intervalo...");
        for (; ; ) {
            int numero = scanner.nextInt();
            if (numero < 0 || numero > 100) {
                System.out.println("Execução encerrada...");
                break;
            }

            if (hashMap.get(numero) == null) {
                hashMap.put(numero, 1);
                continue;
            }

            hashMap.put(numero, hashMap.get(numero) + 1);
        }

        System.out.println();
        System.out.println("Quantidade de vezes que cada número foi digitado:");
        for (Entry<Integer, Integer> keyValuePair : hashMap.entrySet()) {
            System.out.println("NÚMERO: " + keyValuePair.getKey() + " | QUANTIDADE: " + keyValuePair.getValue());
        }

        System.out.println();
        System.out.println("Substituindo os valores das chaves");
        for (Entry<Integer, Integer> keyValuePair : hashMap.entrySet()) {
            if (keyValuePair.getValue() >= 0 && keyValuePair.getValue() <= 5){
                keyValuePair.setValue(5);
                continue;
            }

            keyValuePair.setValue(10);
        }

        System.out.println("Imprimindo os valores substituídos...");
        for (Entry<Integer, Integer> keyValuePair : hashMap.entrySet()) {
            System.out.println(keyValuePair.getValue());
        }
    }
}