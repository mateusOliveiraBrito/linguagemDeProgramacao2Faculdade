import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println("Criando instância...");
        Class<?> randomClass = Class.forName("Models.Aluno");
        Object instance1 = randomClass.newInstance();

        int contador = 1;
        for (Method m : randomClass.getDeclaredMethods()) {
            if (m.getParameterCount() > 0) {
                if (m.getParameters()[0].getType().equals(String.class)) {
                    m.invoke(instance1, new String[]{"Dado aleatório" + contador});
                }

                if (m.getParameters()[0].getType().equals(Integer.class)) {
                    m.invoke(instance1, new Integer[]{contador});
                }

                if (m.getParameters()[0].getType().equals(Boolean.class)) {
                    m.invoke(instance1, new Boolean[]{true});
                }

                contador++;
            }
        }

        Object instance2 = randomClass.newInstance();

        int contador2 = 1;
        for (Method m : randomClass.getDeclaredMethods()) {
            if (m.getParameterCount() > 0) {
                if (m.getParameters()[0].getType().equals(String.class)) {
                    m.invoke(instance2, new String[]{"Dado aleatório" + contador2});
                }

                if (m.getParameters()[0].getType().equals(Integer.class)) {
                    m.invoke(instance2, new Integer[]{contador2});
                }

                if (m.getParameters()[0].getType().equals(Boolean.class)) {
                    m.invoke(instance2, new Boolean[]{true});
                }

                contador2++;
            }
        }

        System.out.println("Instancia 1");
        for (Method m : randomClass.getDeclaredMethods()) {
            if (m.getName().equals("toString")) {
                System.out.println(m.invoke(instance1));
            }
        }

        System.out.println();
        System.out.println("Instancia 2");
        for (Method m : randomClass.getDeclaredMethods()) {
            if (m.getName().equals("toString")) {
                System.out.println(m.invoke(instance1));
            }
        }

        System.out.println();
        System.out.println(instance1.equals(instance2));
    }
}