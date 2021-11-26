package at.ac.fhcampuswien.car.model;

public final class SportsCar extends Automobile {

    public SportsCar(int initialSpeed) {
        super(initialSpeed);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        speed += 10;
    }

}
