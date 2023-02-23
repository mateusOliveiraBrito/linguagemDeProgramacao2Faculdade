package Exercicio03;

public class Potencia {
    public static int calcularPotencia(int x, int k) {
        if (k > 1) {
            var resultado = calcularPotencia(x, k - 1);
            return x * resultado;
        }

        return 1;
    }

    public static int calcularPotenciaSimples(int x, int k) {
        var potencia = 1;
        for(int i = k; i > 0; i--){
            potencia = x * i;
        }

        return potencia;
    }
}
