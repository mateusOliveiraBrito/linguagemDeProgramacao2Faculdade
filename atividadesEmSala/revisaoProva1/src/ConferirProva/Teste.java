package ConferirProva;

public class Teste {
    public static void main(String[] args) {
        try   {
            System.out.println("A");
            f();
            System.out.println("B");
        }catch (Exception e){
            System.out.println("C");
        }finally {
            System.out.println("D");
        }
    }

    static void f() throws Exception {
        throw new Exception();
    }
}
