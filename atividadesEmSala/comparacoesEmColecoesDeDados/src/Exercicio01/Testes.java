package Exercicio01;

import Exercicio01.Models.Agenda;
import Exercicio01.Models.Data;
import Exercicio01.Models.EventoDeAgenda;

import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um evento:");
            System.out.print("Nome: ");

            String nome = scanner.next();

            System.out.print("Dia: ");
            int dia = scanner.nextInt();

            System.out.println("Mês: ");
            int mes = scanner.nextInt();

            System.out.println("Ano: ");
            int ano = scanner.nextInt();

            Data data = new Data(dia, mes, ano);
            EventoDeAgenda evento = new EventoDeAgenda(i, nome, data);

            agenda.eventosDeAgenda.add(evento);
        }
    }
}
