package at.ac.fhcampuswien.car;

import at.ac.fhcampuswien.car.model.Automobile;
import at.ac.fhcampuswien.car.model.PoliceCar;
import at.ac.fhcampuswien.car.model.SportsCar;
import at.ac.fhcampuswien.car.model.Taxi;

public class App {

    public static void main(String[] args) {
        Automobile[] cars = new Automobile[5];

        Taxi taxi1 = new Taxi();

        cars[0] = new PoliceCar();
        cars[1] = taxi1;
        cars[2] = new Taxi();
        cars[3] = new SportsCar(45);
        cars[4] = new Automobile(10);

        for (Automobile car: cars) {
            car.accelerate();
            System.out.println("Speed of " + car.getClass().getSimpleName() + " is " + car.getSpeed());
        }

        taxi1.setOnDuty(true);
        System.out.println("taxi is on duty: " + taxi1.isOnDuty());
    }
}
