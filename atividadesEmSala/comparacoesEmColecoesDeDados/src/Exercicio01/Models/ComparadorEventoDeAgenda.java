package Exercicio01.Models;

import java.util.Comparator;

public class ComparadorEventoDeAgenda implements Comparator<EventoDeAgenda> {

    @Override
    public int compare(EventoDeAgenda evento1, EventoDeAgenda evento2) {
        return evento1.getData().compareTo(evento2.getData());
    }
}