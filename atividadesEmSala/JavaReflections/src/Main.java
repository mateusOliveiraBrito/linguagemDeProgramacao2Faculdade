import Models.Carro;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Object carro;

        try{
            carro = Class.forName("Models.Carro").getDeclaredConstructor();

            for(Field f : carro.getClass().getDeclaredFields()){
                f.setAccessible(true);
                f.set(carro, "Isso é uma propriedade");

                System.out.println(f.getName());
            }
        }catch (Exception ex){
            System.out.println("Erro:");
            ex.printStackTrace();
        }
    }
}