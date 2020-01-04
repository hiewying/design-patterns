package otherpatterns.nullobject;

public class Tea implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Tea is ready !!");
    }

    @Override
    public boolean isNil(){
        return false;
    }
}


