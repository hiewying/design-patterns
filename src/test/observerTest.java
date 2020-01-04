package test;

import org.junit.jupiter.api.Test;
import vendingmachine.decorator.*;
import vendingmachine.observer.*;

public class observerTest {

    @Test
    public void observerTest(){
        Person janePerson = new Person("Jane");
        Person johnPerson = new Person("John");

        // mocha is available
        Beverage mocha = new Coffee("Mocha");
        Item coffee = new Item(mocha, "Available");

        // earl grey tea is not available
        Beverage earl_grey = new Tea("Earl Grey Tea");
        Item tea = new Item(earl_grey, "Not Available");

        //When you opt for option "Notify me the availability of item". Below registerObserver method get executed
        coffee.registerObserver(janePerson);
        coffee.registerObserver(johnPerson);

        tea.registerObserver(janePerson);
        tea.registerObserver(johnPerson);

        //Now product is available/not available
        coffee.setAvailability("Available");
        tea.setAvailability("Not Available");
    }
}


