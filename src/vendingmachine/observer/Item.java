package vendingmachine.observer;

import vendingmachine.decorator.Beverage;

import java.util.ArrayList;
import java.util.List;

public class Item implements Subject {

    private Beverage beverage;
    private String availability;
    private ArrayList<Observer> observers = new ArrayList<>();

    public Item(Beverage beverage, String availability){
        super();
        this.beverage = beverage;
        this.availability = availability;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }
    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }
    public String getBeverageName() {
        return String.valueOf(beverage);
    }
    public void setBeverageName(String beverageName) {
        this.beverage = beverage;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
        notifyObservers();
    }

    public void notifyObservers() {
        System.out.println("Notifying to all the managers the availability of item");
        for (Observer ob : observers) {
            ob.update(this.beverage, this.availability );
        }
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}

