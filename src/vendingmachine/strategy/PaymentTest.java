package vendingmachine.strategy;

public class PaymentTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer(new DebitCardStrategy());
        customer1.pay(20);

        Customer customer2 = new Customer(new CashStrategy());
        customer2.pay(15);
    }
}
