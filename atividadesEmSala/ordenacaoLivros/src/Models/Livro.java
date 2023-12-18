package Models;

public class Livro implements Comparable{

    private String _nome;

    public Livro(String _nome) {
        this._nome = _nome;
    }

    public String getNome() {
        return _nome;
    }

    @Override
    public int compareTo(Object o) {
        var livro = (Livro)o;

        return this._nome.compareTo(livro._nome);
    }
}
