package vendingmachine.factory;

public class VendingMachine {
    public static Beverage getDrink(String str) {
        if("Coffee".equals(str)) {
            return new Coffee();
        } else if("Tea".equals(str)) {
            return new Tea();
        } else if("Pepsi".equals(str)) {
            return new Pepsi();
        }
        return null;
    }
}


