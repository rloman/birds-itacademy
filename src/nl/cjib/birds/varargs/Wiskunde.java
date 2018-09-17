package nl.cjib.birds.varargs;

public class Wiskunde {

    public int max(int a, int... rest) {

       int max = a;

        for(int element: rest) {
            if(element > max) {
                max = element;
            }
        }

        return max;

    }
}
