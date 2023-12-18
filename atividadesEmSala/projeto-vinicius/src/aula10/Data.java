package aula10;

import java.util.Objects;

public class Data {
  int dia;
  int mes;
  int ano;

  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Data)) return false;
    Data data = (Data) o;
    return dia == data.dia && mes == data.mes && ano == data.ano;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dia, mes, ano);
  }

  @Override
  public String toString() {
    return "Data{" +
        "dia=" + dia +
        ", mes=" + mes +
        ", ano=" + ano +
        '}';
  }
}