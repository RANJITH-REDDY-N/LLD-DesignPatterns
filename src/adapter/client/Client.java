package adapter.client;

import adapter.HDFCBankAPIAdapter;
import adapter.PhonePe;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new HDFCBankAPIAdapter());
        phonePe.startTransaction("456081", "456051", 88888, "8261");
    }
}
