package nl.cjib.birds.model;

import java.util.Date;

public class Animal {

    public static int aantalAnimalsCreated;

    static String firstName = "Renske";

    static {
        aantalAnimalsCreated = 0;
        Date d = new Date();

        System.out.println(d);

        firstName = "Piet";


    }


    static {
        // legaal ...
        // hier kun je ook wat doen
        firstName = "Jansen";

    }

    private String name;
    private int age;

    private int m_leeftijd;

    private boolean male;

    private int eggs;


    {
        name = "onbekend";
        aantalAnimalsCreated++;
    }


    public Animal(String name) {

        int leeftijdVanMijnPaard = 42;

        this.name = name;
    }

    public String getName() {

        int leeftijd = 0;
        System.out.println(leeftijd);
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public int getEggs() {
        return eggs;
    }
}