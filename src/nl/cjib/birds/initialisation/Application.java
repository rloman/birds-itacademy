package nl.cjib.birds.initialisation;

import nl.cjib.birds.model.Animal;

public class Application {

    public static void main(String[] args) {
        Animal a = new Animal("a");


        System.out.println(Animal.aantalAnimalsCreated);

        Animal b = new Animal("b");

        System.out.println(Animal.aantalAnimalsCreated);

        Animal c = b;

        System.out.println(Animal.aantalAnimalsCreated);

        System.out.println(Animal.aantalAnimalsCreated);

    }
}
