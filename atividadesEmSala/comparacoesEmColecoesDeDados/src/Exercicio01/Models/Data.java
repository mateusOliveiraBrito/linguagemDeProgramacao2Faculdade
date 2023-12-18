package Exercicio01.Models;

import java.util.Comparator;

public class Data implements Comparable {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public int compareTo(Object object) {
        Data otherData = (Data) object;

        if (this.getAno() > otherData.getAno()) {

            if (this.getMes() > otherData.getMes()) {

                if (this.getDia() > otherData.getDia()) {
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