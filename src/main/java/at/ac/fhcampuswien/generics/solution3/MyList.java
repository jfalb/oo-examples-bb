package at.ac.fhcampuswien.generics.solution3;

public class MyList<T> {

    private T[] items;
    private int size;

    public MyList() {
        this.items = (T[])new Object[100];
        this.size = 0;
    }

    public void addItem(T item) {
        this.items[size] = item;
        this.size += 1;
    }

    public int size() {
        return size;
    }

    public T getItem(int index) {
        return this.items[index];
    }
}
