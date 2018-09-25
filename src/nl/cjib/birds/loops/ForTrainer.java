package nl.cjib.birds.loops;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForTrainer {

    public static void main(String[] args) {

        // 8-11-1962

        LocalDate birthDayFrank = LocalDate.of(1962, 11, 8);

        long aantalDagenFrankOpAarde = ChronoUnit.DAYS.between(birthDayFrank, LocalDate.now());

        System.out.println(aantalDagenFrankOpAarde);

        long jarenFrank = ChronoUnit.YEARS.between(birthDayFrank, LocalDate.now());



        System.out.println(jarenFrank);

        Period periodeFrank = Period.between(birthDayFrank, LocalDate.now());

        System.out.println(periodeFrank);

        System.out.println(periodeFrank.getYears()+", "+periodeFrank.getMonths()+", "+periodeFrank.getDays());

        // you could use System.out.printf() or String.format

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        int j = 33;

        // 0 of vaker uitvoeren
        while (j < 10) {
            System.out.println(j);
            j++;
        }

        // 1 of vaker uitvoeren
        do {
            System.out.println(j);
            j++;
        }
        while (j < 10);

        int[] numbers = {1, 2, 3};

        // enhanced for
        for(int element: numbers) {
            System.out.println(element);
        }

        // basic
        for(int i = 0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }

        
    }
}
