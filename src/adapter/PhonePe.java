package adapter;

public class PhonePe {
    private BankAPIAdapter bankAPIAdapter;
    public PhonePe(BankAPIAdapter bankAPIAdapter){
        this.bankAPIAdapter = bankAPIAdapter;
    }

    public boolean startTransaction(String fromAccountNumber, String toAccountNumber, float amount, String pin)
    {
        if(bankAPIAdapter.authenticate(fromAccountNumber, pin)){
            if(bankAPIAdapter.checkBalance(fromAccountNumber, pin) >= amount){
                if(bankAPIAdapter.transaction(fromAccountNumber, toAccountNumber, amount)){
                    return true;
                }
            }
        }
        return false;
    }
}
