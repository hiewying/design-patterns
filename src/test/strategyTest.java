package test;

import org.junit.jupiter.api.Test;
import vendingmachine.strategy.*;


public class strategyTest {

    @Test
    public void paymentStrategyTest(){
        Customer customer1 = new Customer(new DebitCardStrategy());
        customer1.pay(20);

        Customer customer2 = new Customer(new CashStrategy());
        customer2.pay(15);
    }


}



