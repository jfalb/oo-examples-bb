package at.ac.fhcampuswien.oop;

import java.util.Objects;

public class Person {

    private static int count = 0;

    // Instance variables / Properties
    private String name;
    private int age;
    private double salary;
    private String comments;
    private Department department;

    public static int getCount() {
        return count;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.comments = "";
        count += 1;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        count -= 1;
    }

    public String getName() {
        return name;
    }

    public void sayName() {
        System.out.println("Hello I am " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 120) {
            this.age = age;
        }
    }

    public String toString() {
        return name + "/" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
