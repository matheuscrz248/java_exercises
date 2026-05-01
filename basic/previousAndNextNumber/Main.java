package previousAndNextNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int previous = number - 1;
        int next = number + 1;

        System.out.println("Previous number: " + previous);
        System.out.println("Input number: " + number);
        System.out.println("Next number: " + next);

        scanner.close();
    }
}
