package nl.cjib.birds.ternairy;

public class Application {

    public static void main(String[] args) {

        Car c = new Car();

    }
}


class Car {


    private int mileAge;

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }
}