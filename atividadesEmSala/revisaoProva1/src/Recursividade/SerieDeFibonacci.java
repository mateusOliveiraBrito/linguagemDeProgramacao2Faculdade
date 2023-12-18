package Recursividade;

public class SerieDeFibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));

        System.out.println();
    }

    private static int fibonacci(int numero) {

        if (numero == 1) {
            return 1;
        }

        return numero + fibonacci(numero - 1);
    }
}

//0, 1, 1, 2, 3, 5, 8, 13, 21, ...
//8 = (8-1) + (8-2) = 7 + 6 = 13
//10 = (10 - 1) + (10 - 2) = 9 + 8 = 17
//