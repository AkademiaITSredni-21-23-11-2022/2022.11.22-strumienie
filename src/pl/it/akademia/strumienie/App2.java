package pl.it.akademia.strumienie;

import java.io.BufferedReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Mateusz");
        strings.add("Janusz");
        strings.add("Karol");
        strings.add("Zbyszek");
        strings.add("Tomek");
        strings.add("Darek");
        strings.stream()
                .filter(s -> s.contains("e"))
                .peek(System.out::println)
                .map(s -> new NameLength(s, s.length()))
                .forEach(p -> System.out.println(p.name + " : " + p.length));

        int suma = new Random()
                .ints(100,
                        0,
                        50)
                .reduce(0, Integer::sum);

        System.out.println(suma);
        /*Optional<String> stringBox = find("eu");

        if(stringBox.isPresent()) {
            System.out.println(stringBox.get());
        }

        stringBox.ifPresent(System.out::println);*/
        //??
    }

    public static Optional<String> find(String pattern) {
        List<String> strings = new ArrayList<>();
        strings.add("Mateusz");
        strings.add("Janusz");
        strings.add("Karol");
        strings.add("Zbyszek");
        strings.add("Tomek");
        strings.add("Darek");

        for(String s : strings) {
            if(s.contains(pattern)) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }

    public static String find2(String pattern) {
        List<String> strings = new ArrayList<>();
        strings.add("Mateusz");
        strings.add("Janusz");
        strings.add("Karol");
        strings.add("Zbyszek");
        strings.add("Tomek");
        strings.add("Darek");

        for(String s : strings) {
            if(s.contains(pattern)) {
                return s;
            }
        }
        return null;
    }
}
