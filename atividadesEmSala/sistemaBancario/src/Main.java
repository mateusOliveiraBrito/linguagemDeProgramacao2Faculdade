import Models.ContaCorrente;
import Models.ContaCorrenteEspecial;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("============Conta corrente============");
        var contaCorrente = new ContaCorrente(100);
        System.out.println("Saldo atual: R$ " + contaCorrente.obterSaldoTotal());
        contaCorrente.depositar(1400);
        System.out.println("Saldo após depósito: R$ " + contaCorrente.obterSaldoTotal());
        contaCorrente.sacar(200);
        System.out.println("Saldo após saque: R$ " + contaCorrente.obterSaldoTotal());

        System.out.println("");

        System.out.println("============Conta corrente especial============");
        var contaCorrenteEspecial = new ContaCorrenteEspecial(100);
        System.out.println("Saldo atual: R$ " + contaCorrente.obterSaldoTotal());
        contaCorrente.depositar(1400);
        System.out.println("Saldo após depósito: R$ " + contaCorrente.obterSaldoTotal());
        contaCorrente.sacar(200);
        System.out.println("Saldo após saque: R$ " + contaCorrente.obterSaldoTotal());
    }
}