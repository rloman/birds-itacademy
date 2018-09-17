package nl.cjib.birds.numbers;

public class Application {

    public static void main(String[] args) {


        // using underscores for readability
        long aantalBacterien = 10_000_000_000L;

        double aantal2 = 1_000_000.000_001;

        // other

        //binary numbers

        int getal = 0b10101101;

        System.out.println(getal);

        int hexa = 0xABCDEF;

        System.out.println(hexa);

        int hexa2 = 0xff; //1111111111111111

        String binary = Integer.toBinaryString(173);

        System.out.println(binary);

        int getal2 = 042; /// octaal
        int getal3 = 123; // deciamaal

        System.out.println(getal2);

        short a = 0b10;

        double b = 0b10101101;

        double testM = 0xdeadcafe;

        char firstLetterOfGerbenName = 'G';

        char firstVreemd = '\u0128';

        System.out.println(firstVreemd);

    }
}
