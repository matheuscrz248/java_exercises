package poo.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student name:");
        String name = scanner.nextLine();

        System.out.println("Enter the score for the first term (0-30):");
        int newScore = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(name, newScore);

        System.out.println(student.getScore());

        System.out.println("Enter the score for the second term (0-35):");
        newScore = scanner.nextInt();
        scanner.nextLine();

        student.addScore(newScore);

        System.out.println(student.getScore());

        System.out.println("Enter the score for the third term (0-35):");
        newScore = scanner.nextInt();
        scanner.nextLine();

        student.addScore(newScore);

        System.out.println(student.getScore());

        student.printResult();
    }
}
