import Models.Agenda;

public class Testes {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.armazenaPessoa("Mateus", 21, 1.85f);
        agenda.armazenaPessoa("Altair", 21, 1.55f);
        agenda.armazenaPessoa("Nana", 1, 0.25f);

        agenda.imprimePessoa(1);
        System.out.println();
        agenda.imprimeAgenda();
    }
}
