package at.ac.fhcampuswien.generics.solution2;

import at.ac.fhcampuswien.generics.Person;

public class App {

    public static void main(String[] args) {
        MyObjectList list = new MyObjectList();
        
        list.addItem("Juergen");
        list.addItem("Sabine");
        list.addItem("Max");

        MyObjectList list2 = new MyObjectList();
        list2.addItem("Vorname Nachname");
        list2.addItem(new Person("Vorname1", "Nachname1"));
        list2.addItem(new Person("Vorname2", "Nachname2"));
        list2.addItem(new Person("Vorname3", "Nachname3"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Name " + i + ": " + list.getItem(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            if (list2.getItem(i) instanceof Person) {
                Person p = (Person) list2.getItem(i);
                System.out.println("Name " + i + ": " + p.getFirstname());
            }
        }
    }
}
