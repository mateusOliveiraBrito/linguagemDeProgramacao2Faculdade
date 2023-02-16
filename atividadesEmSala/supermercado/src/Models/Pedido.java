package Models;

import Models.Enums.TipoPagamento;

import java.util.ArrayList;

public class Pedido {
    public TipoPagamento _formaDePagamento = TipoPagamento.Dinheiro;
    public ArrayList<Item> _itens = new ArrayList<Item>();
}
