import Models.Circulo;
import Models.Quadrado;
import Models.Retangulo;
import Models.Triangulo;

public class Main {
    public static void main(String[] args) {

        var circulo = new Circulo(2);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        System.out.println("");

        var triangulo = new Triangulo(2, 5, 1);
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());

        System.out.println("");

        var quadrado = new Quadrado(4);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());

        System.out.println("");

        var retangulo = new Retangulo(2, 4);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}