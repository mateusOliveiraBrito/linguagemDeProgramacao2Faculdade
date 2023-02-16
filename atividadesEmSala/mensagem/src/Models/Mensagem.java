package Models;

public abstract class Mensagem {

    private String _destinatario;

    public Mensagem(String destinatario){
        _destinatario = destinatario;
    }

    public String getDestinatario() {
        return _destinatario;
    }

    public abstract void mostrar();
}
