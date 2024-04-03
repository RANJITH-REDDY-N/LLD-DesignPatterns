package adapter;

public interface BankAPIAdapter {
    float checkBalance(String accountNumber, String pin);
    boolean authenticate(String accountNumber, String pin);
    boolean transaction(String fromAccountNumber, String toAccountNumber, float amount);
}
