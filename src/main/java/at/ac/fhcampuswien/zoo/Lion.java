package at.ac.fhcampuswien.zoo;

public class Lion implements ExtendedAnimalBehaviour, AnimalType {

    private String name;

    public Lion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating meat.");
    }

    @Override
    public int noOfLegs() {
        return 4;
    }

    @Override
    public String typeOfAnimal() {
        return "Lion";
    }

    @Override
    public void run(int speed) {
        System.out.println(name + " is running with " + speed + "km/h.");
    }
}
