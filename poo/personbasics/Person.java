package poo.personbasics;

public class Person {
        String name;
        int age;
        double height;

        public void introducePerson() {
            System.out.printf("Name: %s%nAge: %d%nHeight: %.2f%n", name, age, height);
        }

        public boolean isAdult() {
            return age >= 18;
        }

        public void printVotingStatus() {
            if (isAdult()) {
                System.out.printf("%s can vote!%n%n", name);
            }
            else {
                System.out.printf("%s can't vote!%n%n", name);
            }
        }

}