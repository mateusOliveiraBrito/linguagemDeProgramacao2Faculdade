package Models;

public abstract class Conta {
    protected double _saldo;

    public Conta(double saldo) {
        _saldo = saldo;
    }

    public abstract void sacar(double quantia);

    public void depositar(double quantia) {
        _saldo += quantia;
    }

    public double obterSaldoTotal() {
        return _saldo;
    }
}