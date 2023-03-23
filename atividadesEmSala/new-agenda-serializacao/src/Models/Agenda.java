package Models;

import java.util.ArrayList;

public class Agenda {
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