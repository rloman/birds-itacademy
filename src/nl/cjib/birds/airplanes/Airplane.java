package nl.cjib.birds.airplanes;

public class Airplane {

    private int mileAge;

    public void fly() {
       fly(1);
    }

    public void fly(int m) {
        this.mileAge += m;
    }
}
