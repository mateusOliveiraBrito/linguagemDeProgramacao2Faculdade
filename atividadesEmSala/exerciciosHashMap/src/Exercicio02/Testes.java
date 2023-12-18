package Exercicio02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Testes {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        for (int i = 0; i < 10; i++) {
            hashMap.put(i, "Valor" + i);
        }

        System.out.println("IMPRIMINDO VALORES:");
        ArrayList<String> valores = extractHashMapValues(hashMap);
        for (String valor : valores) {
            System.out.println(valor);
        }
    }

    private static ArrayList<String> extractHashMapValues(HashMap<Integer, String> hashMap) {
        ArrayList<String> valores = new ArrayList<String>();

        for (Map.Entry<Integer, String> keyValuePair : hashMap.entrySet()) {
            valores.add(keyValuePair.getValue());
        }

        return valores;
    }
}
