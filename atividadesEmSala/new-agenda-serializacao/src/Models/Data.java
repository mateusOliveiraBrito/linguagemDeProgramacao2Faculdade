package Models;

import java.io.Serializable;

public class Data implements Comparable<Data>, Serializable {
    private int dia, mes, ano;

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
    public int compareTo(Data otherData) {
        if (this.ano == otherData.ano) {
            if (this.mes == otherData.mes) {
                if (this.dia > otherData.dia) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (this.mes > otherData.mes) {
                return 1;
            } else {
                return -1;
            }
        } else if (this.ano > otherData.ano) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}