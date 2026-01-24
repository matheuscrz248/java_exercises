package evenOddOrNegative;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isEven = number % 2 == 0;
        boolean isNegative = number < 0;

        if (isNegative) {
            if (isEven) {
                System.out.println("Even and negative");
            } else {
                System.out.println("Odd and negative");
            }
        } else {
            if (isEven) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
