package test;

import org.junit.jupiter.api.Test;
import vendingmachine.decorator.*;
import vendingmachine.template.*;


public class templateTest {

    @Test
    public void printReceiptTest(){
        Beverage coffee = new Coffee("Mocha");
        coffee = new SugarDecorator(coffee);

        Receipt receipt = new KerryVendingReceipt(coffee);
        System.out.println(receipt.printReceipt());
    }

}
