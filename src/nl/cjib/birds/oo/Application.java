package nl.cjib.birds.oo;

public class Application {

    public static void main(String[] args) {

        RaceCar racer = new RaceCar("A");

//        System.out.println(racer.getMileAge());

        racer.setSpoilerType("Ferrari");

//        System.out.println(racer.getSpoilerType());

//        racer.drive();

        Car martineHaarAuto = new RaceCar("AABBCC");

        martineHaarAuto.drive();

        Car renseZijnAuto = new Car("RE-NS-E");
        renseZijnAuto.drive();



    }
}
