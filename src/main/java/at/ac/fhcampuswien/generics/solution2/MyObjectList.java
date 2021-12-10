package at.ac.fhcampuswien.generics.solution2;

public class MyObjectList {

    private Object[] items;
    private int size;

    public MyObjectList() {
        this.items = new Object[100];
        this.size = 0;
    }

    public void addItem(Object item) {
        this.items[size] = item;
        this.size += 1;
    }

    public int size() {
        return size;
    }

    public Object getItem(int index) {
        return this.items[index];
    }
}
