package abstraction.bankingsystem;

public class CheckingAccount extends AbstractBankAccount {
    private Double feeAmount;
    private Double feeThreshold;

    public CheckingAccount(Double balance, Double feeThreshold, Double feeAmount) {
        super(balance);
        this.feeThreshold = feeThreshold;
        this.feeAmount = feeAmount;
    }

    public void deductFees() {
        if (getBalance() < feeThreshold) {
            var currentBalance = getBalance();
            currentBalance -= feeAmount;
            System.out.println("Fee deducted: " + currentBalance);
        }
    }
}
