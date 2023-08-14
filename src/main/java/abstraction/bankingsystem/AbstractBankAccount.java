package abstraction.bankingsystem;

public abstract class AbstractBankAccount implements BankAccount {
    private Double balance;

    public AbstractBankAccount(Double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(Double amount) {
        this.balance += amount;
        System.out.println("Amount added");
    }

    @Override
    public void withdraw(Double amount) {
        if (balance < amount) {
            throw new RuntimeException("Insufficient amount");
        }
        System.out.println(amount + " AZN withdraw from " + balance);
        this.balance -= amount;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

}
