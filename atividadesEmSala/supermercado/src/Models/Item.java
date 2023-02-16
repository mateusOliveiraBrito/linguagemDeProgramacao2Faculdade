package Models;

public class Item {
    private Produto _produto;
    private int _quantidade;

    public Item(Produto _produto, int _quantidade) {
        this._produto = _produto;
        this._quantidade = _quantidade;
    }

    public Produto getProduto() {
        return _produto;
    }

    public void setProduto(Produto _produto) {
        this._produto = _produto;
    }

    public int getQuantidade() {
        return _quantidade;
    }

    public void setQuantidade(int _quantidade) {
        this._quantidade = _quantidade;
    }
}