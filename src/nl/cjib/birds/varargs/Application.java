package nl.cjib.birds.varargs;

public class Application {

    public static void main(String[] args) {

        Wiskunde w = new Wiskunde();

        int grootste = w.max(3,4,5);

        System.out.println(grootste);

    }
}
