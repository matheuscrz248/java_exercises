package poo.bankaccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount();
        BankAccount bank2 = new BankAccount();

        bank1.setOwner("Caio");
        bank1.setBalance(2500);
        bank1.deposit(100);
        bank1.withdraw(2600);
        bank1.printStatement();

        bank2.setOwner("Isabela");
        bank2.setBalance(17200);
        bank2.deposit(0);
        bank2.withdraw(7200);
        bank2.printStatement();

    }
}
