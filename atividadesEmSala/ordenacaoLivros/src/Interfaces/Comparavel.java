package Interfaces;

public interface Comparavel {
    /**
     * Assinatura de método que toda classe que quer
     * permitir a comparação entre seus objetos precisa implementar.
     *
     * @param o - Objeto que será comparado.
     * @return 0 se os objetos forem iguais.
     *         > 0 se o objeto recebido é menor que o objeto que será comparado.
     *         < 0 se o objeto recebido é maior que o objeto que será comparado.
     */
    public abstract int comparar(Object o);
}
