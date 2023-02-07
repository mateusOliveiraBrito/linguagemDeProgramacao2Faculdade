package Models;

public class Triangulo extends FormaGeometrica {

    private double _ladoA, _ladoB, _ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        _ladoA = ladoA;
        _ladoB = ladoB;
        _ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        double p = this.calcularPerimetro() / 2.0;

        return Math.sqrt(((p * (p - _ladoA)) * (p - _ladoB) * (p - _ladoC)));
    }

    @Override
    public double calcularPerimetro() {
        return _ladoA + _ladoB + _ladoC;
    }
}