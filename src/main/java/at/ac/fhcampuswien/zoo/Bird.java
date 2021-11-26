package at.ac.fhcampuswien.zoo;

public class Bird implements AnimalBehaviour, AnimalType {

    private String nickName;

    public Bird(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public void eat() {
        System.out.println("Birdie " + nickName + " eats corn.");
    }

    @Override
    public int noOfLegs() {
        return 2;
    }

    @Override
    public String typeOfAnimal() {
        return "Bird";
    }
}
