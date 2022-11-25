package pl.it.akademia.strumienie;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Janusz", "Kowalski"));
        users.add(new User("Karol", "Malinowski"));
        users.add(new User("Zbyszek", "Bereda"));

        List<User> users2 = users.stream()
                .map(u -> new User("Peek2", u.getSurname()))
                .toList();

        List<User> users3 = users.stream()
                .peek(u -> u.setName("Peek"))
                .toList();

        for(User u : users) {
            System.out.println(u);
        }

        for(User u : users2) {
            System.out.println(u);
        }

        for(User u : users3) {
            System.out.println(u);
        }
    }
}
