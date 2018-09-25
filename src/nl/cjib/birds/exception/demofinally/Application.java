package nl.cjib.birds.exception.demofinally;

public class Application {

    public static void main(String[] args) {

        System.out.println(divide(2,1));
        System.out.println(divide(2,0));

    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException ae) {
            return -1;
        }
        finally {
            System.out.println("Dat ging fout of niet!!!");

            return -3;
        }
    }
}
