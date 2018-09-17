package nl.cjib.birds.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 3, 2, 1, -10,0, 13, 21, 34, 55, 89);

        // print even numbers

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(e -> {
                    System.out.println(e);
                });

        System.out.println("Dit is hieronder de derde :-) ");

        numbers.stream()
                .filter(n -> n % 2 != 0)
                .filter(n -> n > 3)
                .map(n -> n * n).forEach(n -> {
            System.out.println(n);
        });

        Stream<Integer> numberStream = numbers.stream().filter(n -> n > 3).peek(n -> {
            System.out.println("peeking:"+n);
        }).map(e -> e * e);

        foo(numberStream);

        numbers.stream().forEach(n -> {
            System.out.println("Dit is handig om te doen!");
        });

        List<Integer> squares = numbers.stream().map( n -> n*n).collect(Collectors.toList());

        long som = numbers.stream().mapToInt(n -> n).sum();

        System.out.println(som);

        numbers.stream().sorted((n,m) -> n-m).forEach(n -> System.out.println(n));

        numbers.stream().distinct().sorted((n,m) -> n-m).forEach(n -> System.out.println(n));

        numbers.stream().findAny();

        List<String> numbersAsString = numbers.stream().map(n -> n.toString()).collect(Collectors.toList());

        System.out.println(String.join(", ", numbersAsString));


    }

    public static void foo(Stream<Integer> streampje) {

        streampje.forEach(n -> {
            System.out.println(n);
        });

    }
}
