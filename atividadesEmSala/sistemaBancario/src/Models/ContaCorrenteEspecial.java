package Models;

public class ContaCorrenteEspecial extends Conta {
    public ContaCorrenteEspecial(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double quantia) {
        var taxaDeOperacao = 0.001;
        _saldo = _saldo - (_saldo * taxaDeOperacao) - quantia;
    }
}