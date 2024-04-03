package adapter;

import adapter.thirdParty.banks.YesBank;

public class YesBankAPIAdapter implements BankAPIAdapter{
    private YesBank yesBank;
    public YesBankAPIAdapter(){
        this.yesBank = new YesBank();
    }
    @Override
    public float checkBalance(String accountNumber, String pin) {
        return 0;
    }

    @Override
    public boolean authenticate(String accountNumber, String pin) {
        return false;
    }

    @Override
    public boolean transaction(String fromAccountNumber, String toAccountNumber, float amount) {
        return false;
    }
}
