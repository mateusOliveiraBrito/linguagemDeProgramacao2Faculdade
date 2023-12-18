package Exercicio01.Models;

import java.util.Comparator;

public class ComparadorDeData implements Comparator<Data> {

    //TO-DO: está com erro de lógica, ainda vai ser refatorado
    @Override
    public int compare(Data data1, Data data2) {

        if (data1.getAno() > data2.getAno()) {

            if (data1.getMes() > data2.getMes()) {

                if (data1.getDia() > data2.getDia()) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        }

        return -1;
    }
}
