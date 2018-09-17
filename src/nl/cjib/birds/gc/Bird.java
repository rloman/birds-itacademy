package nl.cjib.birds.gc;

public class Bird {


    @Override
    protected void finalize() throws Throwable {
        System.out.println("The bird is killed ...");

    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
