package aula10;

import java.util.Comparator;

public class EventoDeAgendaComparador implements Comparator<EventoDeAgenda> {

  @Override
  public int compare(EventoDeAgenda o1, EventoDeAgenda o2) {
    if (o1.data.equals(o2.data)) return 0;
    else if (o1.data.ano == o2.data.ano) { // mesmo ano
      if (o1.data.mes == o2.data.mes) { // mesmo mes
        return o1.data.dia > o2.data.ano ? 1 : -1;
      } else { // meses diferentes
        return o1.data.mes > o2.data.mes ? 1 : -1;
      }
    } else {
      return o1.data.ano > o2.data.ano ? 1 : -1;
    }
  }
}