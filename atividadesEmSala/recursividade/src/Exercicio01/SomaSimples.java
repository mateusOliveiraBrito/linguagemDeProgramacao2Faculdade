package Exercicio01;

public class SomaSimples {
    public static int soma(int numero) {
        if (numero > 0) {
            return numero + soma(numero - 1);
        }

        return 0;
    }
}
