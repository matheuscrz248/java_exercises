package comparison;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Create an algorithm that reads two integer values A and B.
        If the values of A and B are equal, it should add the two values; otherwise, it should multiply A by B.
        At the end of either calculation, the result must be assigned to a variable C and printed on the screen. */

        Scanner scanner = new Scanner(System.in);

        int A, B, C;

        System.out.println("Enter the first number: ");
        A = scanner.nextInt();

        System.out.println("Enter the second number: ");
        B = scanner.nextInt();


        if (A == B) {
            C = A + B;
            System.out.printf("%d + %d = %d%n", A, B, C);
        }
        else {
            C = A * B;
            System.out.printf("%d * %d = %d%n", A, B, C);
        }
        scanner.close();
    }
}
