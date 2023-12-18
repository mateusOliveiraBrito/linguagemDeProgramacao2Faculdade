package aula10;

import java.io.Serializable;
import java.util.ArrayList;

public class Agenda implements Serializable {
  ArrayList<EventoDeAgenda> lista;

  public Agenda() {
    this.lista = new ArrayList<EventoDeAgenda>();
  }
}