package exercicio05.Models;

import exercicio05.Exceptions.NumeroNegativoException;
import exercicio05.Exceptions.ValorMaiorQueLimiteException;

public abstract class Conta {
    private float _limite;
    private float _saldo;

    public Conta(float _saldo) {
        _saldo = _saldo;
    }

    public float getLimite() {
        return _limite;
    }

    public float getSaldo() {
        return _saldo;
    }

    public void definirLimite(float valor) throws NumeroNegativoException {
        if (valor < 0) {
            throw new NumeroNegativoException("Informe uma quantia válida para saque!");
        }

        _limite = valor;
    }

    public void sacar(float valor) throws ValorMaiorQueLimiteException, NumeroNegativoException {
        if (valor < 0) {
            throw new NumeroNegativoException("Informe uma quantia válida para saque!");
        }

        if (valor > _saldo) {
            throw new ValorMaiorQueLimiteException("O valor informado para saque é maior que o limite!");
        }

        _saldo -= valor;
    }

    public void depositar(float valor) throws NumeroNegativoException {
        if (valor < 0) {
            throw new NumeroNegativoException("Informe uma quantia válida para saque!");
        }

        _saldo += valor;
    }
}