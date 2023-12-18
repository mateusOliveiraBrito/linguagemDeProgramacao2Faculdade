package Enums;

public enum ModeloTelevisao {
    Hd(0), UltraWide(1), LCD(2), TFT(3);

    private int valor;

    ModeloTelevisao(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public String getNome(int codigo) {
        switch (codigo) {
            case 0: {
                return ModeloTelevisao.Hd.name();
                break;
            }
            case 1: {
                return ModeloTelevisao.UltraWide.name();
                break;
            }
            case 2: {
                return ModeloTelevisao.LCD.name();
                break;
            }
            case 3: {
                return ModeloTelevisao.TFT.name();
                break;
            }
            default: {
                break;
            }
        }

       // return null;
    }
}
