package temperatureconversion;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double C, F;

        do {
            System.out.println("----- Choose the conversion -----");
            System.out.println("1 - Celsius to Fahrenheit");
            System.out.println("2 - Fahrenheit to Celsius");

            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();
                scanner.nextLine();

                if (option == 1) {
                    System.out.println("\nEnter the temperature in Celsius:");

                    if (scanner.hasNextDouble()) {
                        C = scanner.nextDouble();
                        scanner.nextLine();

                        F = (C * 9 / 5) + 32;

                        System.out.println("\nCelsius: " + C);
                        System.out.println("Fahrenheit: " + F);

                        break;
                    }
                    else {
                        System.out.println("\nEnter a valid number\n");
                        scanner.nextLine();
                    }

                }
                else if (option == 2) {
                    System.out.println("\nEnter the temperature in Fahrenheit:");

                    if (scanner.hasNextDouble()) {
                        F = scanner.nextDouble();
                        scanner.nextLine();

                        C = (F - 32) * 5 / 9;

                        System.out.println("\nCelsius: " + C);
                        System.out.println("Fahrenheit: " + F);

                        break;
                    }
                    else {
                        System.out.println("\nEnter a valid number\n");
                        scanner.nextLine();
                    }

                }
                else {
                    System.out.println("\nError: enter 1 or 2\n");
                }

            }
            else {
                System.out.println("\nError: enter a valid number\n");
                scanner.nextLine();
            }
        } while (true);

        scanner.close();
    }
}