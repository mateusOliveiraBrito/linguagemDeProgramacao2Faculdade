package Models;

public class Promocao extends Mensagem{

    public Promocao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void mostrar() {
        System.out.println("Olá, " + getDestinatario() + "! Este é um alerta promocional.");
    }
}
