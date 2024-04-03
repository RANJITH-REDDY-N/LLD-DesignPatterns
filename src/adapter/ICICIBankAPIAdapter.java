package adapter;

import adapter.thirdParty.banks.ICICIBank;

public class ICICIBankAPIAdapter implements BankAPIAdapter {

    private ICICIBank iciciBank;
    public ICICIBankAPIAdapter(){
        this.iciciBank = new ICICIBank();
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
