package nl.cjib.birds.exception.runtime;

import nl.cjib.birds.exception.checked.RaboException;

public class Application {

    public static void main(String[] args) throws RaboException {
        try {
            System.out.println(divide(3,1));

            String voornaam = null;
            System.out.println(voornaam.length());

            int[] numbers = new int[3];
            // vaut
            for(int i = 0;i<=numbers.length;i++) {
                System.out.println(numbers[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
            // als try faalt dan gaat het programma hier verder(in de handler)
            System.out.println("Delen door nul is flauwekul!!!");
        }
        catch(RuntimeException rte) {
            throw new RaboException("Ontstaan door vaut in teller");
        }

        // als try lukt dan gaat het programma hier verder ...
        // na de catch gaat hier het programma ook gewoon verder ...
        System.out.println("Succesvol einde");

    }

    public static int divide(int a, int b) {
       return a/b;
    }

}
