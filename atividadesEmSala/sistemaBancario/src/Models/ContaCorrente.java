package Models;

public class ContaCorrente extends Conta {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double quantia) {
        var taxaDeOperacao = 0.005;
        _saldo = _saldo - (_saldo * taxaDeOperacao) - quantia;
    }
}
