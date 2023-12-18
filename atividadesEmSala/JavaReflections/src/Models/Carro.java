package Models;

public class Carro {
    private String placa, marca, modelo;

    public Carro() {
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelear() {
        System.out.println("Acelerar...");
    }
}