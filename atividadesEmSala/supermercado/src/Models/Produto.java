package Models;

public class Produto {
    private double _preco;
    private int _quantidadeEstoque;

    public Produto(double preco, int quantidadeEstoque) {
        _preco = _preco;
        _quantidadeEstoque = _quantidadeEstoque;
    }

    public double getPreco() {
        return _preco;
    }

    public void setPreco(double _preco) {
        this._preco = _preco;
    }

    public int getQuantidadeEstoque() {
        return _quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int _quantidadeEstoque) {
        this._quantidadeEstoque = _quantidadeEstoque;
    }
}