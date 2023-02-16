package Models;

public class Urgente implements Mensagem{

    private String _destinatario;

    public Urgente(String destinatario) {
        _destinatario = destinatario;
    }

    public String getDestinatario() {
        return _destinatario;
    }

    @Override
    public void mostrar() {
        System.out.println("Olá, " + getDestinatario() + "! Este é um alerta urgente.");
    }
}
