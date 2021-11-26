package at.ac.fhcampuswien.car.model;

public class Taxi extends Automobile {

    private boolean onDuty;

    public Taxi() {
        super(0);
    }

    public boolean isOnDuty() {
        return onDuty;
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

}
