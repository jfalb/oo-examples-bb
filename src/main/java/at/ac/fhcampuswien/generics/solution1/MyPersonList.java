package at.ac.fhcampuswien.generics.solution1;

import at.ac.fhcampuswien.generics.Person;

public class MyPersonList {

    private Person[] items;
    private int size;

    public MyPersonList() {
        this.items = new Person[100];
        this.size = 0;
    }

    public void addItem(Person item) {
        this.items[size] = item;
        this.size += 1;
    }

    public int size() {
        return size;
    }

    public Person getItem(int index) {
        return this.items[index];
    }
}
