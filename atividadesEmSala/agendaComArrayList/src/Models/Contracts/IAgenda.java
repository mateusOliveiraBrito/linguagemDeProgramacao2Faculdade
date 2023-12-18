package Models.Contracts;

public interface IAgenda {
    void armazenaPessoa(String nome, int idade, float altura);

    void removePessoa(String nome);

    int buscaPessoa(String nome);

    void imprimeAgenda();

    void imprimePessoa(int index);
}
