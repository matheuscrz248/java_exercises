package booleanTrue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean n1;
        boolean n2;
        int input1;
        int input2;

        do {
            System.out.println("Enter the number 1 or 0:");
            input1 = scanner.nextInt();

            if (input1 != 0 && input1 != 1) {
                System.out.println("Error: enter only 1 or 0\n");
            }

        } while (input1 != 0 && input1 != 1);

        n1 = (input1 == 1);

        do {
            System.out.println("Enter the number 1 or 0 again:");
            input2 = scanner.nextInt();

            if (input2 != 0 && input2 != 1) {
                System.out.println("Error: enter only 1 or 0\n");
            }

        } while (input2 != 0 && input2 != 1);

        n2 = (input2 == 1);

        if (n1 && n2) {
            System.out.println("> Both boolean values are true");
        }
        else if (n1) {
            System.out.println(">Boolean value 'n1' is true.\n>Boolean value 'n2' is false.");
        }
        else if (n2) {
            System.out.println(">Boolean value 'n1' is false.\n>Boolean value 'n2' is true.");
        }
        else {
            System.out.println(">Both boolean values are false");
        }

        scanner.close();
    }
}
