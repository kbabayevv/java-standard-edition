package abstraction.bankingsystem;

public class SavingsAccount extends AbstractBankAccount {
    private Double interestRate;

    public SavingsAccount(Double balance, Double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = this.getBalance() * interestRate / 100;
        System.out.println("Interest is " + interest);
    }
}
