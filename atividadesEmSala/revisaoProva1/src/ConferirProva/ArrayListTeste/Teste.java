package ConferirProva.ArrayListTeste;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List array = new ArrayList();

        array.add("hello");
        array.add(2);

        System.out.println(array.get(0) instanceof Object);
        System.out.println(array.get(1) instanceof Integer);
    }
}
