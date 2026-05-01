package paymentmethod;

import java.util.Scanner;

public class PaymentMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int installment;
        double price, finalPrice, installmentPrice;


        do {
            System.out.println("Enter the product price:");

            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                scanner.nextLine();
                break;
            }
            else {
                System.out.println("\nError: enter a valid price");
                scanner.nextLine();
            }

        } while (true);

        System.out.println("\n------- Choose a payment method -------");
        System.out.println("1 - Cash or Pix (one-time payment), 15% discount");
        System.out.println("2 - Credit card (one-time payment), 10% discount");
        System.out.println("3 - Credit card payment in two installments, regular product price, no interest");
        System.out.println("4 - Credit card payment in three or more installments, regular product price plus 10% interest\n");

        int option;

        do {
            System.out.print("Option: ");

            if (scanner.hasNextInt()) {

                option = scanner.nextInt();
                scanner.nextLine();

                if (option >= 1 && option <= 4) {
                    break;
                }
                else {
                    System.out.println("\nError: enter a number from 1 to 4");
                }

            } else {
                System.out.println("\nError: enter a number from 1 to 4");
                scanner.nextLine();
            }

        } while (true);

        switch (option) {
            case 1:
                finalPrice = price * 0.85;
                System.out.printf("%nFinal price (method 1): $%.2f%n", finalPrice);
                break;

            case 2:
                finalPrice = price * 0.90;
                System.out.printf("%nFinal price (method 2): $%.2f%n", finalPrice);
                break;

            case 3:
                finalPrice = price;
                installment = 2;
                installmentPrice = finalPrice / installment;

                System.out.printf("%nInstallments: %dx $%.2f%n", installment, installmentPrice);
                System.out.printf("Final price (method 3): $%.2f%n", finalPrice);

                break;

            case 4:

                do {
                    System.out.println("\nHow many installments will the payment be made in?");

                    if (scanner.hasNextInt()) {
                        installment = scanner.nextInt();
                        scanner.nextLine();

                        if (installment >= 3) {
                            break;
                        } else {
                            System.out.println("\nError: enter a number equal to or greater than three");
                        }
                    } else {
                        System.out.println("Error: enter a valid number");
                        scanner.nextLine();
                    }
                } while (true);

                finalPrice = price * 1.10;
                installmentPrice = finalPrice / installment;

                System.out.printf("%nInstallments: %dx $%.2f%n", installment, installmentPrice);
                System.out.printf("Final price (method 4): $%.2f%n", finalPrice);
                break;
        }

        scanner.close();
    }
}