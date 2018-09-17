package nl.cjib.birds.primivitesandsuch;

public class Application {

    public static final void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        double saldo = 13.0;

        int aantal = 42;

        byte aantalByte = 127;
//        aantalByte = 128; // does not compile since 128 does not fit in a byte

        long grootGetal = 0;

        System.out.println(grootGetal);

        byte b = 3;
        byte c = 4;

        int d = b + c;

        int e = b/c;

        System.out.println(e);

        double f = Integer.valueOf(b).doubleValue() / Integer.valueOf(c).doubleValue();

        System.out.println(f);

    }
}
