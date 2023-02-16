import Models.Informativo;
import Models.Mensagem;
import Models.Promocao;
import Models.Urgente;

public class Main {

    /*==EXPLICANDO A ALTERAÇÃO:==
    * Ao alterar a classe abstrata 'Mensagem' para uma interface, foi necessário remover todos os métodos
    * implementados nela (construtor e getter). Além disso o atributo '_destinatario' foi deslocado para
    * as subclasses, assim como seu encapsulamento (construtor e getter).
    * Por fim, a palavara reservada 'extends' foi substituída por 'implements' nas subclasses
    */
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