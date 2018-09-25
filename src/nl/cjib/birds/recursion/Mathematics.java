package nl.cjib.birds.recursion;

public final class Mathematics {

    public static int fac(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return n * fac(n-1);
        }
    }

    public static boolean isEven(int n) {
        if (n == 0) {
            return true;
        }
        if (n == 1) {
            return false;
        }

        return isEven(n - 2);
    }

    private Mathematics() {

    }
}
