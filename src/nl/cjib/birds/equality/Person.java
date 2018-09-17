package nl.cjib.birds.equality;

public class Person {

    private int sal;

    public Person(int sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return sal == person.sal;
    }

    @Override
    public int hashCode() {
        return sal;
    }
}
