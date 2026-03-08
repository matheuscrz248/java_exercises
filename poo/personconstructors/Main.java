package poo.personconstructors;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Sabrina", 28, 1.67);
        Person p2 = new Person("John", 30, 1.81);

        p1.introducePerson();
        p2.introducePerson();

        if (p1.getAge() > p2.getAge()) {
            System.out.printf("%s is %d years older than %s%n", p1.getName(), p1.getAge() - p2.getAge(), p2.getName());
        }
        else if (p2.getAge() > p1.getAge()) {
            System.out.printf("%s is %d years older than %s%n", p2.getName(), p2.getAge() - p1.getAge(), p1.getName());
        }
        else {
            System.out.printf("%s has the same age as %s%n", p1.getName(), p2.getName());
        }

    }
}
