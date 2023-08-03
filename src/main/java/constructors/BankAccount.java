package constructors;

class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("14914922", "Babayev Kamran");
        bankAccount.deposit(380.96);
        bankAccount.deposit(600.52);
        bankAccount.withdraw(1000.0);
        bankAccount.withdraw(900.0);
        bankAccount.display();
    }
}

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private Double balance;

    public BankAccount(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0.0;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println("Account Number = " + accountNumber + ", Holder Name = " + holderName + ", Current balance = " + balance + " AZN");
    }
}
