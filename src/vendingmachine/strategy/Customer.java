package vendingmachine.strategy;

public class Customer {
    private PaymentStrategy paymentStrategy;

    public Customer(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(int billAmount) {
        paymentStrategy.pay(billAmount);
    }
}


