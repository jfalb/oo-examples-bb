package at.ac.fhcampuswien.generics.solution1;

public class MyStringList {

    private String[] items;
    private int size;

    public MyStringList() {
        this.items = new String[100];
        this.size = 0;
    }

    public void addItem(String item) {
        this.items[size] = item;
        this.size += 1;
    }

    public int size() {
        return size;
    }

    public String getItem(int index) {
        return this.items[index];
    }
}
