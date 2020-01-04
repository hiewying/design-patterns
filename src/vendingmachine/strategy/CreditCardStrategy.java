package vendingmachine.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(int billAmount) {
        System.out.println("Charging "+billAmount+" using Check...");
        System.out.println("Thank you!!");
    }
}


