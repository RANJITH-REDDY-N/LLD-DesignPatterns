package adapter;

import adapter.thirdParty.banks.HDFCBank;

public class HDFCBankAPIAdapter implements BankAPIAdapter {
    private HDFCBank hdfcBank;
    public HDFCBankAPIAdapter(){
        this.hdfcBank = new HDFCBank();
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
