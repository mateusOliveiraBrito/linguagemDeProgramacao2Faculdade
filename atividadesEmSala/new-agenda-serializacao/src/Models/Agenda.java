package Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Agenda implements Serializable {
    private ArrayList<EventoDeAgenda> eventos;

    public Agenda() {
        eventos = new ArrayList<EventoDeAgenda>();
    }

    public void adicionarEvento(EventoDeAgenda evento) {
        eventos.add(evento);
    }

    public ArrayList<EventoDeAgenda> getEventos() {
        return eventos;
    }
}