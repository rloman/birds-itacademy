package nl.cjib.birds.equality;

public class Application {

    public static void main(String[] args) {
        Person a = new Person(4000); // private int sal; // in class Person
        Person b = new Person(4000);

        if(a.equals(b)) {
            System.out.println("A is semantisch gelijk aan B");
        }
        else {
            System.out.println("A is NIET semantisch gelijk aan B");
        }
    }
}
