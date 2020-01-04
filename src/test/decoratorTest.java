package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import vendingmachine.decorator.*;

public class decoratorTest {

    @Test
    public void coffeePriceTest(){
        Beverage cap = new Coffee("Cappucino");
        cap = new SugarDecorator(cap);
        cap = new CaramelDecorator(cap);
        assertEquals(29, cap.getPrice());
    }

    @Test
    public void teaPriceTest(){
        Beverage tea = new Tea("Lyon");
        tea = new SugarDecorator(tea);
        assertEquals(15, tea.getPrice());
    }
}



