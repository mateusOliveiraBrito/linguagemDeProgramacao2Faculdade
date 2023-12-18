import Models.Livro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Livro[] livros = {
                new Livro("Harry Potter"),
                new Livro("O senhor dos anéis"),
                new Livro("A casa no fundo do lago"),
                new Livro("Biblioteca 24h do Mr. Penumbra")
        };

        Arrays.sort(livros);

        for (var livro : livros) {
            System.out.println(livro.getNome());
        }

        /*for (int i = 0; i < livros.length; i++) {
            for (int j = i + 1; j < livros.length; j++) {
                var aux = livros[j];

                if (livros[i].compareTo(livros[j]) > 1) {
                    livros[j] = livros[i];
                    livros[i] = aux;
                }
            }
        }*/
    }
}