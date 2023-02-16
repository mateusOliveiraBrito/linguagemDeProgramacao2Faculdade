package Models;

public class Promocao implements Mensagem{

    private String _destinatario;

    public Promocao(String destinatario) {
        _destinatario = destinatario;
    }

    public String getDestinatario() {
        return _destinatario;
    }

    @Override
    public void mostrar() {
        System.out.println("Olá, " + getDestinatario() + "! Este é um alerta promocional.");
    }
}
