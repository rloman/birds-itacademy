package nl.cjib.birds.oo;

public class RaceCar extends Car {

    private String spoilerType;


    public RaceCar(String licensePlate) {
        super(licensePlate);
    }

    public String getSpoilerType() {
        return spoilerType;
    }

    public void setSpoilerType(String spoilerType) {
        this.spoilerType = spoilerType;
    }

    public void drive() {
        System.out.println("I am driving a Racecar");

    }
}
