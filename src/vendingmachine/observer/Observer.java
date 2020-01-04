package vendingmachine.observer;

import vendingmachine.decorator.Beverage;

public interface Observer {
        public void update(Beverage beverage, String availability);
}


