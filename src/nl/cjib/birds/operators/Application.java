package nl.cjib.birds.operators;

import nl.cjib.birds.model.Animal;

public class Application {

    public static void main(String[] args) {


        int result = 3 + 4;

        System.out.println(result);

        result = result + 5;

        System.out.println(result);

        result += 5;

        System.out.println(result);

        result++;

        System.out.println(result);

        //18

        ++result;

        System.out.println(result);

        System.out.println(result);

        System.out.println(result);

        System.out.println(++result);

        //mod

        int aantalMinutenNaMidderNacht = 245;

        int hours = 245 / 60;

        int minutes = 245 % 60;

        System.out.println(hours + ":" + minutes);

        int leeftijd = 50;
        int leeftijdVrouw = 47;

        boolean male = true;
        boolean female = !male;

        if (leeftijd < leeftijdVrouw || male == true || 5 > 3 || "Raymond".length() > 7) {
            //
        } else {
            //dfkdfk
        }

        String label = null;

        if (female) {
            label = "Vrouwtje";
        } else {
            label = "Mannetje";
        }

        label = female ? "Vrouwtje" : "Mannetje";

        int drie = 1;
        drie *= 3;

        long b = 4;

        double eight = Math.pow(2, 3);

        System.out.println(Math.PI);

        System.out.println(Math.E);

        System.out.println(Math.max(4, 3));


        long getalLong = 83758457284L;

        int getalLongNaarInt = (int) getalLong;

        System.out.println(getalLong);
        System.out.println(getalLongNaarInt);

        byte max = 127;
        max++;


        System.out.println(max);

        System.out.println(Integer.MAX_VALUE + 2);

        if (3 < 5 && male)
            System.out.println("Waar");
        System.out.println("And it is printed");

        int age = 422;


        // switch case
        String label2 = null;

        switch (age) {

            case 42:
                label2 = " U bent nog redelijk jong";

                break;

            case 52:

                label2 = "U bent op leeftijd";

                break;

            default:
                label2 = "U komt niet voor!";

                break;
        }

        System.out.println(label2);

    }
}
