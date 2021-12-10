package at.ac.fhcampuswien.collections;

import java.util.*;

public class Example2 {

    public static void main(String[] args) {
        Map<Long, Person> persons = new HashMap<>();
        persons.put(1800270877L, new Person("Max", "Muster"));
        persons.put(2345080900L, new Person("Emilie", "Muster"));

        System.out.println(persons.get(2345080900L).getFirstname());

        for (Map.Entry<Long, Person> entry : persons.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getLastname());
        }

        Set<String> names = new TreeSet<>();
        names.add("Juergen");
        names.add("Juergen");
        names.add("Sabine");
        names.add("Marie");

        names.forEach(System.out::println);
    }
}
