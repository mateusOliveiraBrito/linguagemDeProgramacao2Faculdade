import Models.Agenda;
import Models.Data;
import Models.EventoDeAgenda;
import Utils.EventoDeAgendaComparator;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.println("======CADASTRO DE EVENTOS DE AGENDA======");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o código do evento '" + (i + 1) + "': ");
            String codigo = scanner.next();

            System.out.println();
            System.out.print("Informe o nome do evento '" + (i + 1) + "': ");
            String nome = scanner.next();

            System.out.println();
            System.out.print("Informe o dia do evento '" + (i + 1) + "': ");
            int dia = scanner.nextInt();

            System.out.println();
            System.out.print("Informe o mês do evento '" + (i + 1) + "': ");
            int mes = scanner.nextInt();

            System.out.println();
            System.out.print("Informe o ano do evento '" + (i + 1) + "': ");
            int ano = scanner.nextInt();

            Data dataEvento = new Data(dia, mes, ano);
            EventoDeAgenda evento = new EventoDeAgenda(codigo, nome, dataEvento);

            agenda.adicionarEvento(evento);
        }

        System.out.println("EVENTOS ANTES DA ORDENAÇÃO:");
        for (EventoDeAgenda evento : agenda.getEventos()) {
            System.out.println(evento.toString());
        }

        Collections.sort(agenda.getEventos(), new EventoDeAgendaComparator());

        System.out.println();
        System.out.println("EVENTOS APÓS DA ORDENAÇÃO:");
        for (EventoDeAgenda evento : agenda.getEventos()) {
            System.out.println(evento.toString());
        }
    }
}