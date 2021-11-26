package at.ac.fhcampuswien.car.model;

public class Automobile {

    protected int speed;

    public Automobile(int initialSpeed) {
        speed = initialSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 5;
    }
}
