package aula10;

import java.util.Collections;
import java.util.Scanner;

public class TesteAgenda {
  public static void main(String[] args) {
    Agenda agenda = new Agenda();

    Scanner scanner = new Scanner(System.in);
    String codigo, nome;
    int dia, mes, ano;
    Data data;

    for (int i = 0; i < 2; i++) {
      System.out.println("Código");
      codigo = scanner.nextLine();

      System.out.println("Nome");
      nome = scanner.nextLine();

      System.out.println("Dia");
      dia = scanner.nextInt();

      System.out.println("Mês");
      mes = scanner.nextInt();

      System.out.println("Ano");
      ano = scanner.nextInt();

      scanner.nextLine(); // hack

      data = new Data(dia, mes, ano);

      EventoDeAgenda eventoDeAgenda = new EventoDeAgenda(codigo, nome, data);
      agenda.lista.add(eventoDeAgenda);
    }

    Collections.sort(agenda.lista, new EventoDeAgendaComparador());

    for (EventoDeAgenda evento : agenda.lista) {
      System.out.println(evento.toString());
    }
Empacotamento.gravarArquivoBinario(agenda.lista, "C:\\repositorios\\arquivos-vinicius\\teste.txt");
  }
}