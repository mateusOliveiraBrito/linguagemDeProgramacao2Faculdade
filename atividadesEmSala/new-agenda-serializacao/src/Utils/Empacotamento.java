package Utils;

import java.io.*;

public class Empacotamento {

    public static void gravarArquivoBinario(Object object, String caminho) {
        File arquivo = new File(caminho);

        try {
            arquivo.delete();
            arquivo.createNewFile();

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo));
            outputStream.writeObject(object);
            outputStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Object lerArquivoBinario(String caminho) {
        try {
            File arquivo = new File(caminho);
            if (arquivo.exists()) {
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivo));
                Object object = inputStream.readObject();
                inputStream.close();

                return object;
            }
        } catch (IOException erro1) {
            System.out.printf("Erro: %s", erro1.getMessage());
        } catch (ClassNotFoundException erro2) {
            System.out.printf("Erro: %s", erro2.getMessage());
        }
        return null;
    }
}
