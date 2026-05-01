package poo.staticmodifier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        CurrencyConverter.dollarPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("How many dollars will be bought?");
        double quantity = scanner.nextDouble();
        scanner.nextLine();

        CurrencyConverter person1 = new CurrencyConverter(quantity);

        System.out.printf("Amount to be paid in reais: R$ %.2f%n", person1.converter());
    }
}
