package nl.cjib.birds.stella;

public final class Earth {

    private final int size;

    public static final String STAR = "Sun";

    public Earth() {
        this.size = 40_000_000;
        System.out.println(Labels.FIRST_NAME);
//        Labels.FIRST_NAME = "Jansen"; // compile error
    }

    public void foo() {
        final int a = 45;
//        a++;
    }

    public final void bar() {

    }
}
