package ascendingOrder;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3;

        do {
            System.out.println("Enter 3 different integers");
            System.out.println("First number:");
            n1 = scanner.nextInt();

            System.out.println("Second number:");
            n2 = scanner.nextInt();

            System.out.println("Third number:");
            n3 = scanner.nextInt();

            if (n1 == n2 || n1 == n3 || n2 == n3) {
                System.out.println("\nError: please enter only distinct numbers.");
            }

        } while (n1 == n2 || n1 == n3 || n2 == n3);

        int[] numbers = { n1, n2, n3 };
        Arrays.sort(numbers);

        System.out.printf("%nAscending order: %d %d %d", numbers[0], numbers[1], numbers[2]);
        System.out.printf("%nDescending order: %d %d %d%n", numbers[2], numbers[1], numbers[0]);

        scanner.close();
    }
}


