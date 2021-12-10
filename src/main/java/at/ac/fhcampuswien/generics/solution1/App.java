package at.ac.fhcampuswien.generics.solution1;

import at.ac.fhcampuswien.generics.Person;

public class App {

    public static void main(String[] args) {
        MyStringList list = new MyStringList();
        
        list.addItem("Juergen");
        list.addItem("Sabine");
        list.addItem("Max");

        MyPersonList list2 = new MyPersonList();
        list2.addItem(new Person("Vorname1", "Nachname1"));
        list2.addItem(new Person("Vorname2", "Nachname2"));
        list2.addItem(new Person("Vorname3", "Nachname3"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Name " + i + ": " + list.getItem(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println("Name " + i + ": " + list2.getItem(i).getFirstname());
        }
    }
}
