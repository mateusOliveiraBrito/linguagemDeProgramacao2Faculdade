package Models;

public abstract class FormaRetangular extends FormaGeometrica {

    private double _base;
    private double _altura;

    public FormaRetangular(double base, double altura) {
        _base = base;
        _altura = altura;
    }

    @Override
    public double calcularArea() {
        return _base * _altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * _base) + (2 * _altura);
    }
}
