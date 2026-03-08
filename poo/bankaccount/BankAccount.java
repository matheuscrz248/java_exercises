package poo.bankaccount;

public class BankAccount {

    private String owner;
    private double balance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

      if (balance >= 0) {
          this.balance = balance;
      }
      else {
          System.out.println("Enter only positive numbers");
      }

    }

    public void deposit(double depositAmount) {

        if (depositAmount < 0) {
            System.out.println("Enter only positive numbers");
        }
        else {
            balance += depositAmount;
        }

    }

    public void withdraw(double withdrawAmount) {

        if (withdrawAmount < 0) {
            System.out.println("Enter only positive numbers");
        }
        else if (withdrawAmount > balance){
            System.out.println("Insufficient funds for withdrawal");
        }
        else {
            balance -= withdrawAmount;
        }

    }

    public void printStatement() {
        System.out.printf("Owner: %s%nBalance: $ %.2f%n%n", owner, balance);
    }


}
