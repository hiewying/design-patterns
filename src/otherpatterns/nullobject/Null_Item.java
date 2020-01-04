package otherpatterns.nullobject;

public class Null_Item implements Beverage {
    @Override
    public void prepare() {
        System.out.println("No item is prepared !!");
    }

    @Override
    public boolean isNil(){
        return true;
    }
}


