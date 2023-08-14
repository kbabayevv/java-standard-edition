package abstraction.bankingsystem;

public interface BankAccount {
    void deposit(Double amount);

    void withdraw(Double amount);

    Double getBalance();
}
