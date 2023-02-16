package Models;

public class Informativo implements Mensagem{

    private String _destinatario;

    public Informativo(String destinatario) {
        _destinatario = destinatario;
    }

    public String getDestinatario() {
        return _destinatario;
    }

    @Override
    public void mostrar() {
        System.out.println("Olá, " + getDestinatario() + "! Este é um alerta informativo.");
    }
}
