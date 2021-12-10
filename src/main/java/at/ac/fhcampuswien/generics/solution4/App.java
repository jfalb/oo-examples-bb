package at.ac.fhcampuswien.generics.solution4;

import at.ac.fhcampuswien.generics.Person;
import at.ac.fhcampuswien.generics.solution3.MyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        
        list.add("Juergen");
        list.add("Sabine");
        list.add("Max");

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("Vorname1", "Nachname1"));
        list2.add(new Person("Vorname2", "Nachname2"));
        list2.add(new Person("Vorname3", "Nachname3"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Name " + i + ": " + list.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println("Name " + i + ": " + list2.get(i).getFirstname());
        }
    }
}
