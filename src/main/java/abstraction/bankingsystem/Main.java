package abstraction.bankingsystem;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000.0, 10000.0, 5.0);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.deductFees();
        checkingAccount.deposit(100.0);
        System.out.println(checkingAccount.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount(500.0, 6.0);
        savingsAccount.calculateInterest();
    }
}
