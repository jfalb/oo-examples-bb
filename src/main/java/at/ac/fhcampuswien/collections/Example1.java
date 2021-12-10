package at.ac.fhcampuswien.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Vorname1", "Nachname1"));
        list.add(new Person("Aorname2", "Nachname2"));
        list.add(new Person("Aorname3", "Nachname3"));
        list.add(new Person("Vorname4", "Nachname4"));

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        int i = intList.get(0);

        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            Person p = it.next();
            System.out.println(p.getFirstname() + " " + p.getLastname());
        }

        for (Person p : list) {
            System.out.println(p.getFirstname() + " " + p.getLastname());
        }

        // (parameter) -> expression       = Lambda expression
        List<String> filteredList = list.stream()
                .filter(person -> person.getFirstname().startsWith("V"))
                .filter(person -> person.getLastname().length() > 2)
                .map(person -> person.getFirstname() + " " + person.getLastname())
                .collect(Collectors.toList());

        // Method reference
        filteredList.forEach(System.out::println);
    }
}
