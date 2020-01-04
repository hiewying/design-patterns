package otherpatterns.facade;

public class Tea implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Tea is ready !!");
    }
}


