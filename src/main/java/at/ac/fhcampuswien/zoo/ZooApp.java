package at.ac.fhcampuswien.zoo;

import java.util.Scanner;

public class ZooApp {

    public static void main(String[] args) {
        Lion l1 = new Lion("Leo");
        System.out.println("Mein Löwe heißt " + l1.getName());
        l1.eat();

        Bird b1 = new Bird("Sue");
        b1.eat();

        AnimalBehaviour[] animals = new AnimalBehaviour[4];
        animals[0] = l1;
        animals[1] = b1;
        animals[2] = new Bird("Ellen");
        animals[3] = new Lion("Margret");

        AnimalType[] types = new AnimalType[2];
        types[0] = l1;
        types[1] = b1;

        for (AnimalType type : types) {
            System.out.println("Type of animal: " + type.typeOfAnimal());
        }

        ExtendedAnimalBehaviour e1;
        e1 = l1;
        e1.run(40);

        feedAll(animals);
    }

    public static void feedAll(AnimalBehaviour[] animals) {
        for (AnimalBehaviour animal : animals) {
            animal.eat();
        }
    }
}
