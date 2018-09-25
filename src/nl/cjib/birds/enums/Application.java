package nl.cjib.birds.enums;

public class Application {

    public static void main(String[] args) {
        Person jan = new Person();
        jan.setMyFavouriteSeason(Season.Spring);

        System.out.println(jan.getMyFavouriteSeason());


        String inputFromScreen = "Spring";

        Season enumFromString = Season.valueOf(inputFromScreen);

        System.out.println(enumFromString);

        System.out.println(enumFromString.ordinal());

        for(Season season: Season.values()) {
            System.out.println(season);
        }

        String spring = Season.Spring.toString();
    }
}
