package swap;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a, b, temp;

        System.out.println("--- Variable Swap ---");
        System.out.println("Enter the value of A:");
        a = scanner.nextLine();

        System.out.println("\nEnter the value of B:");
        b = scanner.nextLine();

        System.out.println("\n--- Before the swap ---");
        System.out.println("\nValue of A: " + a);
        System.out.println("Value of B: " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("\n--- Swap completed ---");
        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);

        scanner.close();
    }
}
