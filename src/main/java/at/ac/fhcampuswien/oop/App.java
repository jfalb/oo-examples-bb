package at.ac.fhcampuswien.oop;

public class App {

    public static void main(String[] args) {
        System.out.println("Anzahl Personen: " + Person.getCount());
        Person p1 = new Person("Juergen", 46);
        System.out.println("Anzahl Personen: " + Person.getCount());
        Person p2 = new Person("Sabine", 45);
        System.out.println("Anzahl Personen: " + Person.getCount());
        Person p3 = new Person("Sabine", 45);
        System.out.println("Anzahl Personen: " + Person.getCount());
        Person friend = p2;
        p3 = null;
        System.gc();

        Department research = new Department("F&E", p1);
        System.out.println(research.getName() +  " - " + research.getDirector());

        p1.sayName();
        p2.sayName();
        friend.sayName();

        System.out.println(p1.getName() + " und " + p2.getName());

        System.out.println(p1.getName() + " ist " + p1.getAge() + " Jahre alt.");
        p1.setAge(48);
        System.out.println(p1.getName() + " ist " + p1.getAge() + " Jahre alt.");
        p1.setAge(-10);
        System.out.println(p1.getName() + " ist " + p1.getAge() + " Jahre alt.");

        if (p2 == friend) {
            System.out.println("p2 and friend are same");
        } else {
            System.out.println("p2 and friend are different");
        }

        if (p2.equals(p3)) {
            System.out.println("p2 and p3 are same");
        } else {
            System.out.println("p2 and p3 are different");
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
