package otherpatterns.nullobject;

public class VendingMachineTest {
    public static void main(String[] args) {
        Beverage tea = VendingMachine.getDrink("Tea");
        tea.prepare();

        Beverage coffee = VendingMachine.getDrink("Coffee");
        coffee.prepare();

        Beverage nil = VendingMachine.getDrink("Null_Item");
        nil.prepare();
    }
}









