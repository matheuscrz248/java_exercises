package poo.netsalary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Enter the name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the gross salary: ");
        double grossSalary = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the tax: ");
        double tax = scanner.nextDouble();
        scanner.nextLine();

        emp.Register(name, grossSalary, tax);

        System.out.println(emp);

        System.out.println("Witch percentage to increase salary?");
        double percentage = scanner.nextDouble();
        scanner.nextLine();

        emp.IncreaseSalary(percentage);

        System.out.println("Updated employee!");

        System.out.println(emp);
    }
}
