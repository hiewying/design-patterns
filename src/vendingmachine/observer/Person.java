package vendingmachine.observer;

import vendingmachine.decorator.Beverage;

public class Person implements Observer {
    String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void update(Beverage beverage, String availabiliy) {

        System.out.println("Hello "+personName+", "+beverage.getName()+" is now "+availabiliy+" on Kerry Vending");
    }
}


