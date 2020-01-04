package vendingmachine.factory;

public class Tea implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Tea is ready !!");
    }
}


