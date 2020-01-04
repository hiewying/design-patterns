package vendingmachine.template;

import vendingmachine.decorator.Beverage;

public class KerryVendingReceipt extends Receipt {

    private Beverage beverage;

    public KerryVendingReceipt(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String item(){
        return ("Item: " + beverage.getName() + "\nPrice: " + beverage.getPrice());
    }

}


