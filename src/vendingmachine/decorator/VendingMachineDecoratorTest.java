package vendingmachine.decorator;

public class VendingMachineDecoratorTest {

    public static void main(String args[]){
        Beverage beverage = new SugarDecorator(new CaramelDecorator(new Tea("Earl Grey Tea")));
        beverage.decorateBeverage();

        beverage = new SugarDecorator(new CaramelDecorator(new Coffee("Mocha")));
        beverage.decorateBeverage();
    }
}


