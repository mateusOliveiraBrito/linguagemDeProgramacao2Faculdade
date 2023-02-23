import Models.Enums.TipoPagamento;
import Models.Item;
import Models.Pedido;
import Models.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //produtos
        var sabonete = new Produto(3.5, 50);
        var arroz = new Produto(21.99, 100);

        //itens
        var item1 = new Item(sabonete, 10);

        var item2 = new Item(arroz, 3);

        //pedido
        var pedido = new Pedido();
        pedido._formaDePagamento = TipoPagamento.Cartao;

        if (sabonete.getQuantidadeEstoque() > item1.getQuantidade()) {
            pedido._itens.add(item1);
        }

        if (arroz.getQuantidadeEstoque() > item2.getQuantidade()) {
            pedido._itens.add(item2);
        }
    }
}