import Models.Informativo;
import Models.Mensagem;
import Models.Promocao;
import Models.Urgente;

public class Main {
    public static void main(String[] args) {
        Mensagem[] mensagens = {
                new Informativo("Mateus"),
                new Promocao("Carlos"),
                new Urgente("Maria")
        };

        for (var mensagem : mensagens) {
            mensagem.mostrar();
        }
    }
}