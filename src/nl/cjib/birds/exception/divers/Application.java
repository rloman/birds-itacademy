package nl.cjib.birds.exception.divers;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {


        String ageAsString = "Poedel";

//        int age = Integer.parseInt(ageAsString);

//        System.out.println(age+1);

        LocalDate gebDatumMarnix = LocalDate.of(1995, 4, 6);

        System.out.println(gebDatumMarnix);

        gebDatumMarnix = LocalDate.of(2015, 44, 44);
    }

    public static boolean isInteger(String in) {

        try {
            Integer.parseInt(in);
            return true;
        }
        catch(NumberFormatException nfe){
            return false;
        }

    }
}
