package vendingmachine.singleton;

import vendingmachine.template.KerryVendingReceipt;


import java.util.ArrayList;
import java.util.List;

public enum ReceiptsLogger {
    INSTANCE;

    private List<KerryVendingReceipt> receipts = new ArrayList<>();

    private ReceiptsLogger() {}

    public void logReceipt(KerryVendingReceipt kerryReceipt) {
        this.receipts.add(kerryReceipt);
    }

    public String totalReceipts(){
        return receipts.toString();
    }

}


