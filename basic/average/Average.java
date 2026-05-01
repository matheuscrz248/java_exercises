package average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double g1, g2, g3, average;
        String name;

        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter the first grade:");
        g1 = scanner.nextDouble();

        System.out.println("Enter the second grade:");
        g2 = scanner.nextDouble();

        System.out.println("Enter the third grade:");
        g3 = scanner.nextDouble();

        average = (g1 + g2 + g3) / 3;

        System.out.println("\nName: " + name);

        if (average <= 2) {
            System.out.println("You did not pass");
        }
        else if (average < 7) {
            System.out.println("You are in remedial classes");
        }
        else {
            System.out.println("You passed!");
        }

        System.out.printf("Your grade average: %.1f%n", average);

        scanner.close();
    }
}


