package ConferirProva;

public class Teste2 {
    public static void main(String[] args) {
        System.out.println(f(1));
    }

    static Exception f(int numero) {
        if (numero > 0) {
            return new Exception("0");
        }

        throw new RuntimeException("1");
    }
}
