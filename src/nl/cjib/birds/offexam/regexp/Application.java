package nl.cjib.birds.offexam.regexp;

import javax.sound.midi.Soundbank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {

        String emailAddress = "raymond@example.com";

        String emailPattern = "[a-z]+@[a-z]+\\.(com|nl)";

        boolean b = Pattern.matches(emailPattern, emailAddress);
        System.out.println(b);


        Pattern p = Pattern.compile(emailPattern);

        if(Pattern.matches("regexp", "input")) {

        }

        Matcher matcher = p.matcher(emailAddress);
        if(matcher.matches()) {
            System.out.println("Rocks");
        }

        if(matcher.find()) {
            System.out.println("matcher.find is true");
        }
        if(emailAddress.matches(emailPattern)) {
            System.out.println("Veel mooier???");
        }

        String firstName = "Gerben";

        if(firstName.matches("Gerben")) {
            System.out.println("Gerben matches the String Gerben");
        }

        // rubylar laten zien

        String regexpForDigit = "\\d+";

        if("123".matches(regexpForDigit)) {
            System.out.println("123 matches ");
        }

    }
}