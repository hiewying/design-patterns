package otherpatterns.facade;

public class Pepsi implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Pepsi is ready !!");
    }
}


