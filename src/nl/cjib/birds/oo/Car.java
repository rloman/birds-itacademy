package nl.cjib.birds.oo;

public class Car {

    private int mileAge;
    private String licensePlate;


    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void drive() {
        System.out.println("I am driving a car");
        this.mileAge++;

        int mileAge = 3; // shadowing /// pretty bad practice
        this.mileAge++;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void drive(int delta) {
        this.mileAge += delta;
    }
}
