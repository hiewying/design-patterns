package otherpatterns.nullobject;

public class VendingMachine {
    public static Beverage getDrink(String str) {
        if("Coffee".equals(str)) {
            return new Coffee();
        } else if("Tea".equals(str)) {
            return new Tea();
        }
        return new Null_Item();
    }
}


