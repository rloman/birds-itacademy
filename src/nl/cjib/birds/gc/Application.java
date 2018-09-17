package nl.cjib.birds.gc;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        foo();

        System.gc();

        Thread.sleep(3000);

        System.out.println("End of programm...");

    }

    public static void foo() {

        Bird b = new Bird();

    }
}
