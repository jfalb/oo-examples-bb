package at.ac.fhcampuswien.oop;

public class Department {

    private String name;
    private Person director;

    public Department(String name, Person director) {
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public Person getDirector() {
        return director;
    }
}
