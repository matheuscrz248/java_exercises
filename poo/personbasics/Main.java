package poo.personbasics;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Fernando";
        p1.age = 21;
        p1.height = 1.60;

        Person p2 = new Person();
        p2.name = "João";
        p2.age = 17;
        p2.height = 1.86;

        p1.introducePerson();
        p1.printVotingStatus();

        p2.introducePerson();
        p2.printVotingStatus();

    }
}
