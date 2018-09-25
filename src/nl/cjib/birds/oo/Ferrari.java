package nl.cjib.birds.oo;

public class Ferrari extends RaceCar {
    private int kostprijs;

    public Ferrari(String licensePlate) {
        super(licensePlate);
    }

    public Ferrari() {
        this("Unknown"); // call to local constructor
        this.kostprijs = 10000; // assign 10000 to private field kostprijs
    }
}
