package Models;

public class Informativo extends Mensagem{

    public Informativo(String destinatario) {
        super(destinatario);
    }

    @Override
    public void mostrar() {
        System.out.println("Olá, " + getDestinatario() + "! Este é um alerta informativo.");
    }
}
