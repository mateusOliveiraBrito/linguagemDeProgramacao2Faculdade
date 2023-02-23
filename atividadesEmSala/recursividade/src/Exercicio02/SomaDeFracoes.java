package Exercicio02;

public class SomaDeFracoes {
    public static double somaDeFracoes(double numero) {
        if (numero > 1){
            return (1 / numero) + somaDeFracoes(numero - 1);
        }

        return 1;
    }
}
