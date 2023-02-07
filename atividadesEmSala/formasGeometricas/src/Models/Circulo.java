package Models;

public class Circulo extends FormaGeometrica {
    private double _raio;

    public Circulo(double raio) {
        _raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(_raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * _raio;
    }
}