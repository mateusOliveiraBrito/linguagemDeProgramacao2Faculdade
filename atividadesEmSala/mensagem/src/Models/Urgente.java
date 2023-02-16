package Models;

public class Urgente extends Mensagem{

    public Urgente(String destinatario) {
        super(destinatario);
    }

    @Override
    public void mostrar() {
        System.out.println("Olá, " + getDestinatario() + "! Este é um alerta urgente.");
    }
}
