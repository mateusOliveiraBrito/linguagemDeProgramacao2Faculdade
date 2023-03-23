package Utils;

import java.io.*;

public class Empacotamento {

    public static void gravarArquivoBinario(Object object, String caminho) throws IOException {
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

    public static Object lerArquivoBinario(String caminho) throws IOException, ClassNotFoundException {
        try {
            File arquivo = new File(caminho);
            if (arquivo.exists()) {
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivo));
                Object object = inputStream.readObject();
                inputStream.close();

                return object;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
