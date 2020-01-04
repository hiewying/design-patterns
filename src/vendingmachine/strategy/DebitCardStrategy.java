package vendingmachine.strategy;

public class DebitCardStrategy implements PaymentStrategy {
    @Override
    public void pay(int billAmount) {
        System.out.println("Charging "+billAmount+" using Debit Card...");
        System.out.println("Thank you!!");
    }
}



