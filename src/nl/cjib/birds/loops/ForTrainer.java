package nl.cjib.birds.loops;

import java.util.ArrayList;
import java.util.List;

public class ForTrainer {

    public static void main(String[] args) {
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
