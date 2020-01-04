package test;

import org.junit.jupiter.api.Test;
import vendingmachine.decorator.Beverage;
import vendingmachine.decorator.Coffee;
import vendingmachine.decorator.SugarDecorator;
import vendingmachine.singleton.ReceiptsLogger;
import vendingmachine.template.KerryVendingReceipt;
import vendingmachine.template.Receipt;

public class singletonTest {

    @Test
    public void test() {
        ReceiptsLogger logger = ReceiptsLogger.INSTANCE;

        Beverage coffee = new Coffee("Mocha");
        coffee = new SugarDecorator(coffee);

        Receipt receipt = new KerryVendingReceipt(coffee);

//        logger.logReceipt(receipt);
        System.out.println(logger.totalReceipts());
    }
}


