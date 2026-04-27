package poo.netsalary;

public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public void Register(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public void IncreaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    public Double NetSalary() {
        return grossSalary - tax;
    }

    public String toString() {
        return "Employee: " + name + ", $ " + String.format("%.2f", NetSalary()) + "\n";
    }
}
