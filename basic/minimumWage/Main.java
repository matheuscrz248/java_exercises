package minimumWage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double minWage = 1200;

        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        double numberOfMinWages = salary / minWage;

        System.out.printf("You earn %.2f minimum wages!%n", numberOfMinWages);

        scanner.close();
    }
}
