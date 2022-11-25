package pl.it.akademia.strumienie;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Mateusz");
        strings.add("Janusz");
        strings.add("Karol");
        strings.add("Zbyszek");
        strings.add("Tomek");
        strings.add("Darek");

        List<String> pofiltrowane = new ArrayList<>();
        for(String imie : strings) {
            if(imie.contains("o")) {
                pofiltrowane.add(imie);
            }
        }

        System.out.println(strings);
        System.out.println(pofiltrowane);
    }
}
