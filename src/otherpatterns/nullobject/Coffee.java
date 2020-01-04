package otherpatterns.nullobject;

public class Coffee implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Coffee is ready !!");
    }

    @Override
    public boolean isNil(){
        return false;
    }
}


