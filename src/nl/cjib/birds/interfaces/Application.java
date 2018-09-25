package nl.cjib.birds.interfaces;

public class Application {

    public static void main(String[] args) {
        Televisie pascalZijnTV = new BNO();

        pascalZijnTV.on();

        pascalZijnTV.switchChannel(5);

        System.out.println(pascalZijnTV.getCurrentChannel());

//        Televisie tv = new Televisie();  ffffout
    }
}
