package poo.personconstructors;

public class Person {

    private final String name;
    private final int age;
    private final double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void introducePerson() {
        System.out.printf("Name: %s%nAge: %d%nHeight: %.2f%n%n", name, age, height);
    }

}
