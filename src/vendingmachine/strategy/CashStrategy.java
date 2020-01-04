package vendingmachine.strategy;

public class CashStrategy implements PaymentStrategy {
    @Override
    public void pay(int billAmount) {
        System.out.println("Charged "+billAmount+" using Cash...");
        System.out.println("Thank you!!");
    }
}


