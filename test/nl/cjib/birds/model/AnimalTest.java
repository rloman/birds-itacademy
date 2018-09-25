package nl.cjib.birds.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest {

    private Animal animal; // class under test

    @Before
    public void setUp() {
        this.animal = new Animal("Gerrit");
    }

    @Test
    public void testAge() {

        this.animal.setAge(45);

        int actual = animal.getAge();

        Assert.assertEquals(45, actual);

    }

    @Test
    public void testName() {

        this.animal.setName("Karel");
        Assert.assertEquals("Karel", this.animal.getName());
    }

    @Test
    public void testEggs() {
        this.animal.setEggs(3);

        Assert.assertEquals(3, this.animal.getEggs());
    }
}
