package otherpatterns.facade;

public class Coffee implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Coffee is ready !!");
    }
}


