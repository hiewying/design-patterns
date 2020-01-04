package vendingmachine.template;

import vendingmachine.decorator.*;

public abstract class Receipt {

    public String printReceipt(){
        StringBuilder receipt = new StringBuilder();
        receipt.append(header());
        receipt.append(item());
        receipt.append(footer());

        return receipt.toString();
    }

    protected String header(){
        return ("Welcome to Kerry Vending \n___________________________\n");
    }

    abstract String item();

    protected String footer(){
        return ("\n___________________________\nSee you next time !!!");
    }


}
