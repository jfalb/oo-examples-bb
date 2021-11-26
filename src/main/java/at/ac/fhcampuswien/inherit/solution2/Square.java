package at.ac.fhcampuswien.inherit.solution2;

public class Square extends GeometricObject {

    private int edgeLength;

    public Square(int x, int y, int edgeLength) {
        super(x, y);
        this.edgeLength = edgeLength;
    }

    public void setSize(int length) {
        this.edgeLength = length;
    }
}
