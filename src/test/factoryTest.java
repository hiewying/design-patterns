package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import vendingmachine.factory.*;

public class factoryTest {

    @Test
    public void factoryTeaTest(){
    Beverage tea = VendingMachine.getDrink("Tea");
    assertEquals("vendingmachine.factory.Tea", tea.getClass().getName());
    }

    @Test
    public void factoryCoffeeTest(){
        Beverage coffee = VendingMachine.getDrink("Coffee");
        assertEquals("vendingmachine.factory.Coffee", coffee.getClass().getName());
    }

}




