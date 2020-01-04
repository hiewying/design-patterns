package vendingmachine.factory;

public class VendingMachineTest {
    public static void main(String[] args) {
        Beverage tea = VendingMachine.getDrink("Tea");
        tea.prepare();

        Beverage coffee = VendingMachine.getDrink("Coffee");
        coffee.prepare();

        Beverage pepsi = VendingMachine.getDrink("Pepsi");
        pepsi.prepare();
    }
}









