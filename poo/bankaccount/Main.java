package poo.bankaccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount();
        BankAccount bank2 = new BankAccount();

        bank1.setOwner("Caio");
        bank1.setBalance(20000);
        bank1.deposit(100);
        bank1.withdraw(10100);
        bank1.printStatement();

        bank2.setOwner("Isabela");
        bank2.setBalance(17200);
        bank2.deposit(0);
        bank2.withdraw(7200);
        bank2.printStatement();

        if (bank1.getBalance() > bank2.getBalance()) {
            System.out.printf("%s has a higher balance than %s%n", bank1.getOwner(), bank2.getOwner());
        }
        else if (bank2.getBalance() > bank1.getBalance()) {
            System.out.printf("%s has a higher balance than %s%n", bank2.getOwner(), bank1.getOwner());
        }
        else {
            System.out.printf("%s has the same balance as %s%n", bank1.getOwner(), bank2.getOwner());
        }

    }
}
